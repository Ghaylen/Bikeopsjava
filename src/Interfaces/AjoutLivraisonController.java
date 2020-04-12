/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entities.Livraison;
import Services.ServiceLivraison;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author benfr
 */
public class AjoutLivraisonController implements Initializable {

    @FXML
    private TextField tfid3;
    @FXML
    private TextField tfetat3;
    @FXML
    private TextField tfadr3;
    @FXML
    private TextField tfliv3;
    @FXML
    private TextField tfvil3;
    @FXML
    private Button btn2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void saveproduit2(ActionEvent event) {
        try {
            int id = Integer.parseInt(tfid3.getText());
            boolean etat = Boolean.parseBoolean(tfetat3.getText());
            String adresse = tfadr3.getText();
            int livreurid = Integer.parseInt(tfliv3.getText());
            String ville = tfvil3.getText();

            Livraison L = new Livraison(id, etat, adresse, livreurid, ville);
            ServiceLivraison sl = new ServiceLivraison();
            sl.addlivraison(L);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("detailslivraison.fxml"));
            Parent root = loader.load();
            DetailslivraisonController dw = loader.getController() ;
            dw.setTextID("" + L.getId());
            dw.setTextEtat("" + L.getEtat());
            dw.setTextAdress(L.getAdress());
            dw.setTextLivreurid(""+L.getLivreurid());
            dw.setTextVille(L.getVille());

            tfid3.getScene().setRoot(root);
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
}
