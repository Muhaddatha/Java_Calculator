/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUICalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author 3pear
 */
public class CalculatorFXMLController implements Initializable {

    @FXML
    private Button key1;
    @FXML
    private Button key2;
    @FXML
    private Button key4;
    @FXML
    private Button key3;
    @FXML
    private Button divisionButton;
    @FXML
    private Button multiplicationButton;
    @FXML
    private Button subtractionButton;
    @FXML
    private Button additionButton;
    @FXML
    private Button key9;
    @FXML
    private Button key8;
    @FXML
    private Button key7;
    @FXML
    private Button key6;
    @FXML
    private Button key5;
    @FXML
    private Button clearButton;
    @FXML
    private Button key0;
    @FXML
    private Button spaceButton;
    @FXML
    private Button calculateButton;
    @FXML
    private Label calculationLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calculateOperation(ActionEvent event) {
    }
    
}
