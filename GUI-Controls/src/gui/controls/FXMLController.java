/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controls;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author EricC
 */
public class FXMLController implements Initializable {

    @FXML
    private CheckBox coffeeCheckBox;
    @FXML
    private CheckBox espressoCheckBox;
    @FXML
    private CheckBox teaCheckBox;
    @FXML
    private CheckBox bagelCheckBox;
    @FXML
    private CheckBox donutCheckBox;
    @FXML
    private ToggleGroup milk;
    @FXML
    private Button checkoutButton;
    @FXML
    private Label textLabel;
    @FXML
    private RadioButton skimMilkRadioButton;
    @FXML
    private RadioButton wholeMilkRadioButton;
    @FXML
    private RadioButton soyMilkRadioButton;
    @FXML
    private RadioButton coconutMilkRadioButton;
    @FXML
    private RadioButton espressoNoMilk;
    @FXML
    private ToggleGroup espressoMilk;
    @FXML
    private RadioButton espressoSkimMilk;
    @FXML
    private RadioButton espressoWholeMilk;
    @FXML
    private RadioButton espressoSoyMilk;
    @FXML
    private RadioButton espressoCoconutMilk;
    @FXML
    private RadioButton teaNoMilk;
    @FXML
    private ToggleGroup teaMilk;
    @FXML
    private RadioButton teaSkimMilk;
    @FXML
    private RadioButton teaWholeMilk;
    @FXML
    private RadioButton teaSoyMilk;
    @FXML
    private RadioButton teaCoconutMilk;
    @FXML
    private RadioButton noMilkRadioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void checkOutClicked(ActionEvent event) {
        String labelText = "";
        double totalCost = 0;
        if (coffeeCheckBox.isSelected()) {
            labelText += "Coffee " + coffeeGotMilk() + " $1.00\n";
            totalCost += 1;
        }
        if (espressoCheckBox.isSelected()) {
            labelText += "Espresso " + espressoGotMilk() + " $2.00\n";
            totalCost += 2;
        }
        if (teaCheckBox.isSelected()) {
            labelText += "Tea " + teaGotMilk() + " $1.50\n";
            totalCost += 1.5;
        }
        if (bagelCheckBox.isSelected()) {
            labelText += "Bagel $.75\n";
            totalCost += .75;
        }
        if (donutCheckBox.isSelected()) {
            labelText += "Donut $1.25\n";
            totalCost += 1.25;
        }
        labelText += "Total Cost: $" + totalCost;
        textLabel.setText(labelText);
    }

    private String coffeeGotMilk() {
        if (skimMilkRadioButton.isSelected()) {
            return "with skim milk";
        }
        if (wholeMilkRadioButton.isSelected()) {
            return "with whole milk";
        }
        if (soyMilkRadioButton.isSelected()) {
            return "with soy milk";
        }
        if (coconutMilkRadioButton.isSelected()) {
            return "with coconut milk";
        }
        return "";
    }
    
    private String espressoGotMilk() {
        if (espressoSkimMilk.isSelected()) {
            return "with skim milk";
        }
        if (espressoWholeMilk.isSelected()) {
            return "with whole milk";
        }
        if (espressoSoyMilk.isSelected()) {
            return "with soy milk";
        }
        if (espressoCoconutMilk.isSelected()) {
            return "with coconut milk";
        }
        return "";
    }
    
    private String teaGotMilk() {
        if (teaSkimMilk.isSelected()) {
            return "with skim milk";
        }
        if (teaWholeMilk.isSelected()) {
            return "with whole milk";
        }
        if (teaSoyMilk.isSelected()) {
            return "with soy milk";
        }
        if (teaCoconutMilk.isSelected()) {
            return "with coconut milk";
        }
        return "";
    }

    @FXML
    private void coffeClicked(ActionEvent event) {
        noMilkRadioButton.setVisible(coffeeCheckBox.isSelected());
        skimMilkRadioButton.setVisible(coffeeCheckBox.isSelected());
        wholeMilkRadioButton.setVisible(coffeeCheckBox.isSelected());
        soyMilkRadioButton.setVisible(coffeeCheckBox.isSelected());
        coconutMilkRadioButton.setVisible(coffeeCheckBox.isSelected());
    }

    @FXML
    private void espressoClicked(ActionEvent event) {
        espressoNoMilk.setVisible(espressoCheckBox.isSelected());
        espressoSkimMilk.setVisible(espressoCheckBox.isSelected());
        espressoWholeMilk.setVisible(espressoCheckBox.isSelected());
        espressoSoyMilk.setVisible(espressoCheckBox.isSelected());
        espressoCoconutMilk.setVisible(espressoCheckBox.isSelected());
        
    }

    @FXML
    private void teaClicked(ActionEvent event) {
        teaNoMilk.setVisible(teaCheckBox.isSelected());
        teaSkimMilk.setVisible(teaCheckBox.isSelected());
        teaWholeMilk.setVisible(teaCheckBox.isSelected());
        teaSoyMilk.setVisible(teaCheckBox.isSelected());
        teaCoconutMilk.setVisible(teaCheckBox.isSelected());
        
    }

}
