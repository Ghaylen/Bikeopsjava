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
public class DetailsController implements Initializable {

    @FXML
    private TextField tfid2;
    @FXML
    private TextField tfnom2;
    @FXML
    private TextField tfprenom2;
    @FXML
    private TextField tfetat2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setTextID(String message) {
        this.tfid2.setText(message);
    }

    public void setTextNom(String message) {
        this.tfnom2.setText(message);
    }

    public void setTextPrenom(String message) {
        this.tfprenom2.setText(message);
    }
    public void setTextEtat(String message) {
        this.tfetat2.setText(message);
    }
    
}
