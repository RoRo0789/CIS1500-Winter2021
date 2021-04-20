
package gui.controls;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class FXMLController implements Initializable {

    double totalCost;
    double coffeeCost;
    double espressoCost;
    double teaCost;

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

    @FXML
    private TextField cardNumberTextField;
    @FXML
    private Button payButton;
    @FXML
    private Label sugarSliderLabel;
    @FXML
    private Slider sugarSlider;
    @FXML
    private ListView<String> listView;

    // initialize anything not fxml in the constructor
    public FXMLController() {
        totalCost = 0;
        coffeeCost = 0;
        espressoCost = 0;
        teaCost = 0;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        payButton.setDisable(true);
        cardNumberTextField.setVisible(false);
        sugarSlider.setVisible(false);
        sugarSliderLabel.setVisible(false);
        listView.getItems().addAll("In store pickup", "curside order", "delivery");
    }

    @FXML
    private void checkOutClicked(ActionEvent event) {
        String labelText = "";
        totalCost = 0;
        coffeeCost = 1;
        espressoCost = 2;
        teaCost = 1.5;
        if (coffeeCheckBox.isSelected()) {
            labelText += String.format("Coffee %s $%.2f\n", coffeeGotMilk(), coffeeCost);
            totalCost += coffeeCost;
        }
        if (espressoCheckBox.isSelected()) {
            labelText += String.format("Espresso %s $%.2f\n", espressoGotMilk(), espressoCost);
            totalCost += espressoCost;
        }
        if (teaCheckBox.isSelected()) {
            labelText += String.format("Tea %s $%.2f\n", teaGotMilk(), teaCost);
            totalCost += teaCost;
        }
        if (bagelCheckBox.isSelected()) {
            labelText += "Bagel $.75\n";
            totalCost += .75;
        }
        if (donutCheckBox.isSelected()) {
            labelText += "Donut $1.25\n";
            totalCost += 1.25;
        }
        labelText += String.format("Total Cost: $%.2f\n", totalCost);
        
        labelText += "order for " + listView.getSelectionModel().getSelectedItem();
        
        textLabel.setText(labelText);
        payButton.setDisable(false);
        cardNumberTextField.setVisible(true);
        cardNumberTextField.clear();
        cardNumberTextField.setPromptText("Enter your card #");
    }

    private String coffeeGotMilk() {
        if (skimMilkRadioButton.isSelected()) {
            return "with skim milk";
        }
        if (wholeMilkRadioButton.isSelected()) {
            return "with whole milk";
        }
        if (soyMilkRadioButton.isSelected()) {
            coffeeCost += .5;
            return "with soy milk +($.50) ";
        }
        if (coconutMilkRadioButton.isSelected()) {
            coffeeCost += .5;
            return "with coconut milk +($.50) ";
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
            espressoCost += .5;
            return "with soy milk +($.50) ";
        }
        if (espressoCoconutMilk.isSelected()) {
            espressoCost += .5;
            return "with coconut milk +($.50) ";
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
            teaCost += .5;
            return "with soy milk +($.50) ";
        }
        if (teaCoconutMilk.isSelected()) {
            teaCost += .5;
            return "with coconut milk +($.50) ";
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
        
        // would be nice to have a slider for each beverage type
        sugarSlider.setVisible(true);
        sugarSliderLabel.setVisible(true);
    }

    @FXML
    private void espressoClicked(ActionEvent event) {
        espressoNoMilk.setVisible(espressoCheckBox.isSelected());
        espressoSkimMilk.setVisible(espressoCheckBox.isSelected());
        espressoWholeMilk.setVisible(espressoCheckBox.isSelected());
        espressoSoyMilk.setVisible(espressoCheckBox.isSelected());
        espressoCoconutMilk.setVisible(espressoCheckBox.isSelected());
        
        // would be nice to have a slider for each beverage type
        sugarSlider.setVisible(true);
        sugarSliderLabel.setVisible(true);
    }

    @FXML
    private void teaClicked(ActionEvent event) {
        teaNoMilk.setVisible(teaCheckBox.isSelected());
        teaSkimMilk.setVisible(teaCheckBox.isSelected());
        teaWholeMilk.setVisible(teaCheckBox.isSelected());
        teaSoyMilk.setVisible(teaCheckBox.isSelected());
        teaCoconutMilk.setVisible(teaCheckBox.isSelected());
        
        // would be nice to have a slider for each beverage type
        sugarSlider.setVisible(true);
        sugarSliderLabel.setVisible(true);
    }

    @FXML
    private void payButtonClicked(ActionEvent event) {
        cardNumberTextField.clear();
        cardNumberTextField.setPromptText("Thanks!");
    }

}
