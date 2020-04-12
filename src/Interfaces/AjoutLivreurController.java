/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entities.Livreur;
import Services.ServiceLivreur;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author benfr
 */
public class AjoutLivreurController implements Initializable {

    @FXML
    private TextField tfid;
    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfprenom;
    @FXML
    private TextField tfetat;
    @FXML
    private Button btnvalider;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveproduit(ActionEvent event) {
        try {
            int id = Integer.parseInt(tfid.getText());
            boolean etat = Boolean.parseBoolean(tfetat.getText());
            String nom = tfnom.getText();
            String prenom = tfprenom.getText();
            
            if (tfnom.getText().length() == 0 ||  tfprenom.getText().length() == 0 ||  tfetat.getText().length() == 0 ||  tfid.getText().length() == 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("veuillez remplir le formulaire!!");
            alert.setHeaderText("Attention !");
            alert.setContentText("Certains champs sont vides !!");
            alert.showAndWait();  
       }

            Livreur L = new Livreur(id, nom, prenom, etat);
            ServiceLivreur sl = new ServiceLivreur();
            sl.addClass(L);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Details.fxml"));
            Parent root = loader.load();
            DetailsController dw = loader.getController();
            dw.setTextID("" + L.getId());
            dw.setTextEtat("" + L.isEtat());
            dw.setTextNom(L.getNom());
            dw.setTextPrenom(L.getPrenom());

            tfid.getScene().setRoot(root);
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
    
}
