/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author benfr
 */
public class DetailslivraisonController implements Initializable {

    @FXML
    private TextField tfid4;
    @FXML
    private TextField tfetat4;
    @FXML
    private TextField tfadr4;
    @FXML
    private TextField tfliv4;
    @FXML
    private TextField tfvil4;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     public void setTextID(String message) {
        this.tfid4.setText(message);
    }

    public void setTextEtat(String message) {
        this.tfetat4.setText(message);
    }

    public void setTextAdress(String message) {
        this.tfadr4.setText(message);
    }
    public void setTextLivreurid(String message) {
        this.tfliv4.setText(message);
    }
     public void setTextVille(String message) {
        this.tfvil4.setText(message);
    }
}
