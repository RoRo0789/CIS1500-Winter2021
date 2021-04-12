/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.examplespart1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author EricC
 */
public class FXMLController implements Initializable {

    @FXML
    private Label pcStatsLabel;
    @FXML
    private TextArea textArea;
    @FXML
    private Button firstButton;
    @FXML
    private Button secondButton;
    @FXML
    private Button thirdButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void firstButton(ActionEvent event) {
        // used by first and third buttons
        if ( event.getSource() == firstButton ){
            textArea.appendText("Clicked first button!\n");
        }
        else if ( event.getSource() == thirdButton ){
            textArea.appendText("Clicked third button!\n");
        }
    }

    @FXML
    private void secondButton(ActionEvent event) {
        textArea.appendText("Clicked second button!\n");
    }
    
}
