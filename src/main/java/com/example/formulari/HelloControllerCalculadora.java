package com.example.formulari;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Objects;

public class HelloControllerCalculadora {
    @FXML
    private Label resultat;
    @FXML
    private TextField numeros1;


    String operacio;



    @FXML
    protected void botosuma() {
        numeros1.setText(numeros1.getText() + " + ");
    }
    @FXML
    protected void botoresta() {
        numeros1.setText(numeros1.getText() + " - ");
    }
    @FXML
    protected void botomulti() {
        numeros1.setText(numeros1.getText() + " * ");
    }
    @FXML
    protected void botodivi() {
        numeros1.setText(numeros1.getText() + " / ");
    }

    public void boto1(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "1");
    }

    public void boto2(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "2");
    }

    public void boto3(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "3");
    }

    public void boto4(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "4");
    }

    public void boto5(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "5");
    }

    public void boto6(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "6");
    }

    public void boto7(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "7");
    }

    public void boto8(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "8");
    }

    public void boto9(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "9");
    }

    public void botopunt(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + ".");
    }

    public void boto0(ActionEvent actionEvent) {
        numeros1.setText(numeros1.getText() + "0");
    }

    public void botoIgual(ActionEvent actionEvent) {
         operacio = numeros1.getText();
         double resultat = 0;
         try {
             String [] operacioParts = operacio.split(" ");
             if (Objects.equals(operacioParts[1], "+")){
                 resultat = Double.parseDouble(operacioParts[0]) + Double.parseDouble(operacioParts[2]);
             }
             if (Objects.equals(operacioParts[1], "-")){
                 resultat = Double.parseDouble(operacioParts[0]) - Double.parseDouble(operacioParts[2]);
             }
             if (Objects.equals(operacioParts[1], "*")){
                 resultat = Double.parseDouble(operacioParts[0]) * Double.parseDouble(operacioParts[2]);
             }
             if (Objects.equals(operacioParts[1], "/")){
                 resultat = Double.parseDouble(operacioParts[0]) / Double.parseDouble(operacioParts[2]);
             }
         }catch (Exception ignored) {
         }
        numeros1.setText(String.valueOf(resultat));
    }

    public void botoClear(ActionEvent actionEvent) {
        numeros1.setText("");
    }
}