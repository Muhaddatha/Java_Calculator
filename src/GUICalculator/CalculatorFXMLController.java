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
import javafx.scene.control.TextField;

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

    
    boolean debugging = true;
    
    @FXML
    private TextField displayWindow; //This is where the user can see the operation
    //and its result
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
   
        if(event.getSource() == key1){
            displayWindow.setText(displayWindow.getText() + "1");
            if(debugging){System.out.println("Button 1 clicked!");}
        }
        else if(event.getSource() == key2){
             displayWindow.setText(displayWindow.getText() + "2");
            if(debugging){System.out.println("Button 2 clicked!");}
        }
        else if(event.getSource() == key3){
             displayWindow.setText(displayWindow.getText() + "3");
            if(debugging){System.out.println("Button 3 clicked!");}
        }
        else if(event.getSource() == key4){
             displayWindow.setText(displayWindow.getText() + "4");
            if(debugging){System.out.println("Button 4 clicked!");}
        }
        else if(event.getSource() == key5){
             displayWindow.setText(displayWindow.getText() + "5");
            if(debugging){System.out.println("Button 5 clicked!");}
        }
        else if(event.getSource() == key6){
             displayWindow.setText(displayWindow.getText() + "6");
            if(debugging){System.out.println("Button 6 clicked!");}
        }
        else if(event.getSource() == key7){
             displayWindow.setText(displayWindow.getText() + "7");
            if(debugging){System.out.println("Button 7 clicked!");}
        }
        else if(event.getSource() == key8){
             displayWindow.setText(displayWindow.getText() + "8");
            if(debugging){System.out.println("Button 8 clicked!");}
        }
        else if(event.getSource() == key9){
             displayWindow.setText(displayWindow.getText() + "9");
            if(debugging){System.out.println("Button 9 clicked!");}
        }
        else if(event.getSource() == key0){
             displayWindow.setText(displayWindow.getText() + "0");
            if(debugging){System.out.println("Button 0 clicked!");}
        }
        else if(event.getSource() == clearButton){
             displayWindow.setText("");
            if(debugging){System.out.println("Display window cleared!");}
        }
        else if(event.getSource() == additionButton){
             displayWindow.setText(displayWindow.getText() + "+");
            if(debugging){System.out.println("Button + clicked!");}
        }
        else if(event.getSource() == multiplicationButton){
             displayWindow.setText(displayWindow.getText() + "*");
            if(debugging){System.out.println("Button * clicked!");}
        }
        else if(event.getSource() == subtractionButton){
             displayWindow.setText(displayWindow.getText() + "-");
            if(debugging){System.out.println("Button - clicked!");}
        }
        else if(event.getSource() == divisionButton){
             displayWindow.setText(displayWindow.getText() + "/");
            if(debugging){System.out.println("Button / clicked!");}
        }
        else if(event.getSource() == spaceButton){
             displayWindow.setText(displayWindow.getText() + " ");
            if(debugging){System.out.println("Button space clicked!");}
        }
    }
    
    
}
