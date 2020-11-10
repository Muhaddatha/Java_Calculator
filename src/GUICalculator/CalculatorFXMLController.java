/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUICalculator;

import static java.lang.Character.getNumericValue;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
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
    boolean finishedCalculation = false;
    
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
   
        displayWindow.setStyle("-fx-text-fill: black; -fx-font-size: 16px");
        if(finishedCalculation){
            displayWindow.clear();
            finishedCalculation = false;
        }
        
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
        else if(event.getSource() == calculateButton){
            if(debugging){System.out.println("Calculate button clicked!");}
            calculatePostFix(displayWindow.getText());
            displayWindow.setAlignment(Pos.CENTER_RIGHT);
            finishedCalculation = true;
            
        }
    }
    
    private void calculatePostFix(String postFixOperationUnedited){
        //step1: get rid of white spaces in postFixOperation
        //step2: check if string is empty
        //step 3: 
        //String[] operand = {};
        
        
        String[] postFixOperation = postFixOperationUnedited.split(" ");
        if (debugging){ 
            System.out.println("calculatePostFix function called!");
            System.out.println("Printing values in operation");
            for(int i = 0; i < postFixOperation.length; i++){
                System.out.println(postFixOperation[i]);
            }
        }
        
        if(postFixOperation.length == 0){
            if(debugging) { 
                System.out.println("No operation to calculate is specified.");
            }
            return;
        }
        
        Stack<Double> myStack = new Stack<>();
        
        double resultOfOperation = 0;
        double operand = 0;
        
        for(int i = 0; i < postFixOperation.length; i++){
            
            if(!"+".equals(postFixOperation[i]) && !"-".equals(postFixOperation[i]) && !"/".equals(postFixOperation[i]) && !"*".equals(postFixOperation[i])){
                operand = Double.valueOf(postFixOperation[i]);
                 if(debugging) { System.out.println("Element in for loop: " + postFixOperation[i] + "\n "
                    + "and its numeric value is: " + operand);}
            }
            else{
                if(debugging){System.out.println("Skipped operand part");}
            }
           //System.out.println(i);
            
//           if(Double.valueOf(postFixOperation[0]) == -1){
//               displayWindow.setAlignment(Pos.CENTER_LEFT);
//               displayWindow.setStyle("-fx-text-fill: red; -fx-font-size: 10px");
//               displayWindow.setText("ERROR: not a postifx expression.");
//               return;
//               
//           }
            
//            if(debugging){
//                System.out.println("\tThe value being scanned is: " + postFixOperation[i]
//                + " and its numeric value is " + operand);
//            }
            if(!"+".equals(postFixOperation[i]) && !"-".equals(postFixOperation[i]) && !"/".equals(postFixOperation[i]) && !"*".equals(postFixOperation[i])){
                myStack.push(operand);
                if(debugging){ System.out.println("\tNew value enterred stack: " + operand); }
            }
            else{
                Double x = myStack.pop();
                
                Double y = myStack.pop();
              
                if(debugging){System.out.println("\tThe two top elements are " + x + " and " + y);}
                
                //System.out.println(postFixOperation[i]);
                if("+".equals(postFixOperation[i])){
                    //calculate addition
                    if(debugging){System.out.println("\tCalculating addition of " + x + " and " +
                    y + ". \n\tPushing " + (y + x) + " into the stack.");}
                    myStack.push(y + x);
                    resultOfOperation = y + x;
                }
                else if("-".equals(postFixOperation[i])){
                    if(debugging){System.out.println("\tCalculating subtraction of " + x + " and " +
                    y + ". \n\tPushing " + (y - x) + " into the stack.");}
                    myStack.push(y - x);
                    resultOfOperation = y - x;
                }
                else if("/".equals(postFixOperation[i])){
                    if(x == 0){
                        if(debugging) {System.out.println("\tERROR: Division by zero!");}
                        displayWindow.setStyle("-fx-text-fill: red; -fx-font-size: 10px");
                        displayWindow.setAlignment(Pos.CENTER_LEFT);
                        displayWindow.setText("ERROR: DIVISION BY ZERO");
                        return;
                    }
                    else{
                        if(debugging){System.out.println("\tCalculating division of " + x + " and " +
                            y + ". \n\tPushing " + (y / x) + " into the stack.");}
                        myStack.push(y / x);
                        resultOfOperation = y / x;
                    }
                }
                else if("*".equals(postFixOperation[i])){
                    if(debugging){System.out.println("\tCalculating multiplation of " + x + " and " +
                        y + ". \n\tPushing " + (y * x) + " into the stack.");}
                    myStack.push(y * x);
                    resultOfOperation = y * x;
                }
                   
                }
                
                
            }
            
          
        displayWindow.clear();
        
        myStack.clear();
        if(debugging){System.out.println("Emptied stack! (since operation is over)");}
                
        String resultString;
        int intPartOfResultOfOperation = (int) resultOfOperation;
        if((resultOfOperation - intPartOfResultOfOperation) == 0 ){
            //if the number iss whole and not a fraction
            resultString = String.valueOf(intPartOfResultOfOperation);
        }
        else{
            //the result of the operation is a decimal number\
            resultString = String.valueOf(resultOfOperation);
        }
                
        displayWindow.setText(resultString);
        return;
       
        
    }
    
    
}
