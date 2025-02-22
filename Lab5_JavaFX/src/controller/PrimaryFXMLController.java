/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author arkpatel
 */
public class PrimaryFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    TextField nameTextField;
    
    public void submit(){
        
        String name = nameTextField.getText();
        System.out.println("Thanks for submitting" + name);
        
        Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("Success");
        userAlert.setHeaderText("Thanks for Submitting");
        userAlert.setContentText(name);
        userAlert.showAndWait();
    }
}
