package com.example.formulari;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class HelloController {
    @FXML
    private Label resultat;
    @FXML
    private TextField numeros1;
    @FXML
    private TextField numeros2;


    @FXML
    protected void botosuma() {
        try {
            double valor1 = Double.parseDouble((numeros1.getText().replace(',','.'))) + Double.parseDouble((numeros2.getText().replace(',','.')));
            resultat.setText(String.valueOf(valor1));
        }catch (Exception e){
            System.out.println("SYNTAXT ERROR");
        }
    }
    @FXML
    protected void botoresta() {
        try {
            double valor1 = Double.parseDouble((numeros1.getText().replace(',','.'))) - Double.parseDouble((numeros2.getText().replace(',','.')));
            resultat.setText(String.valueOf(valor1));
        }catch (Exception e){
            System.out.println("SYNTAXT ERROR");
        }
    }
    @FXML
    protected void botomulti() {
        try {
            double valor1 = Double.parseDouble((numeros1.getText().replace(',','.'))) * Double.parseDouble((numeros2.getText().replace(',','.')));
            resultat.setText(String.valueOf(valor1));
        }catch (Exception e){
            System.out.println("SYNTAXT ERROR");
        }
    }
    @FXML
    protected void botodivi() {
        try {
            double valor1 = Double.parseDouble((numeros1.getText().replace(',','.'))) / Double.parseDouble((numeros2.getText().replace(',','.')));
            resultat.setText(String.valueOf(valor1));
        }catch (Exception e){
            System.out.println("SYNTAXT ERROR");
        }
    }

//    @FXML
//    protected void boto2() {
//        String cadenaAux = "Adeu ";
//        cadenaAux += nom.getText();
//        text2.setText(cadenaAux);
//    }
}