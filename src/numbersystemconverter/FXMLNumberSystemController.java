/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersystemconverter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;



/**
 *
 * @author david
 */
public class FXMLNumberSystemController implements Initializable {
    
    ObservableList<String> numberSystemsList = FXCollections.observableArrayList("Binary",
            "Octal", "Decimal", "Hexadecimal");
    @FXML ComboBox<String> comboBox1;
    @FXML ComboBox<String> comboBox2;
    @FXML Button convertButton;
    
    
    
    String selection1;
    String selection2;
    
    @FXML TextField userInput;
    String number;
    @FXML TextField answer;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox1.getItems().addAll(numberSystemsList);
        comboBox2.getItems().addAll(numberSystemsList);
        number = "";
        userInput.setText("");
        answer.setText("");
        
        
        
    }  
    
    public void getComboBoxSelection(){
        this.selection1 = comboBox1.getSelectionModel().getSelectedItem();
        comboBox2.getItems().remove(selection1);
        this.selection2 = comboBox2.getSelectionModel().getSelectedItem();
        
        
    }
    
    
    
    
    
    public void convertInput(){
        
        switch (selection1){
            case "Binary":
                switch(selection2){
                    case "Octal":
                        number = userInput.getText();
                        int bnum = Integer.parseInt(number, 2);
                        String octString = Integer.toOctalString(bnum);
                        answer.setText(octString);
                        break;
                    case "Decimal":
                        number = userInput.getText();
                        int dnum = Integer.parseInt(number, 2);
                        String decString = Integer.toString(dnum);
                        answer.setText(decString);
                        break;
                    case "Hexadecimal":
                        number = userInput.getText();
                        int hnum = Integer.parseInt(number, 2);
                        String hexString = Integer.toHexString(hnum).toUpperCase();
                        answer.setText(hexString);
                        break;
                }break;
            case "Octal":
                switch(selection2){
                    case "Binary":
                        number = userInput.getText();
                        int bnum = Integer.parseInt(number, 8);
                        String binString = Integer.toBinaryString(bnum);
                        answer.setText(binString);
                        break;
                    case "Decimal":
                        number = userInput.getText();
                        int decnum = Integer.parseInt(number, 8);
                        String decString = Integer.toString(decnum);
                        answer.setText(decString);
                        break;
                    case "Hexadecimal":
                        number = userInput.getText();
                        int hexnum = Integer.parseInt(number, 8);
                        String hexString = Integer.toHexString(hexnum).toUpperCase();
                        answer.setText(hexString);
                        break;
                }break;
            case "Decimal":
                switch(selection2){
                    case "Binary":
                        number = userInput.getText();
                        int binum = Integer.parseInt(number);
                        String binString = Integer.toBinaryString(binum);
                        answer.setText(binString);
                        break;
                    case "Octal":
                        number = userInput.getText();
                        int octnum = Integer.parseInt(number);
                        String octString = Integer.toOctalString(octnum);
                        answer.setText(octString);
                        break;
                    case "Hexadecimal":
                        number = userInput.getText();
                        int hexnum = Integer.parseInt(number);
                        String hexString = Integer.toHexString(hexnum).toUpperCase();
                        answer.setText(hexString);
                        break;
                }break;
            case "Hexadecimal":
                switch(selection2){
                    case "Binary":
                        number = userInput.getText();
                        int bnum = Integer.parseInt(number, 16);
                        String biString = Integer.toBinaryString(bnum);
                        answer.setText(biString);
                        break;
                    case "Octal":
                        number = userInput.getText();
                        int onum = Integer.parseInt(number, 16);
                        String oString = Integer.toOctalString(onum);
                        answer.setText(oString);
                        break;
                    case "Decimal":
                        number = userInput.getText();
                        int decnum = Integer.parseInt(number, 16);
                        String dString = Integer.toString(decnum);
                        answer.setText(dString);
                        break;
                }break;
        }
    }
    
    public void Refresh(){
        comboBox1.getItems().clear();
        comboBox2.getItems().clear();
        comboBox1.getItems().addAll(numberSystemsList);
        comboBox2.getItems().addAll(numberSystemsList);
        number = "";
        userInput.setText("");
        answer.setText("");
    }
    
}
