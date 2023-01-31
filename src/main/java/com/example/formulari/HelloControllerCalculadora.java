package com.example.formulari;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloControllerCalculadora {
    @FXML
    private Label resultat;
    @FXML
    private TextField numeros1;
    @FXML
    private TextField numeros2;

    int operacio;


    @FXML
    protected void botosuma() {
        if (operacio == 0){
            operacio = Integer.parseInt(numeros1.getText());
        }else{
            numeros2.setText(String.valueOf(operacio + Integer.parseInt(numeros1.getText())));
        }
        numeros1.setText(numeros1.getText() + "+");
    }
    @FXML
    protected void botoresta() {
        if (operacio == 0){
            operacio = Integer.parseInt(numeros1.getText());
        }else{
            operacio = operacio - Integer.parseInt(numeros1.getText());
        }
        numeros1.setText(numeros1.getText() + "-");
    }
    @FXML
    protected void botomulti() {
        if (operacio == 0){
            operacio = Integer.parseInt(numeros1.getText());
        }else{
            operacio = operacio * Integer.parseInt(numeros1.getText());
        }
        numeros1.setText(numeros1.getText() + "*");
    }
    @FXML
    protected void botodivi() {
        if (operacio == 0){
            operacio = Integer.parseInt(numeros1.getText());
        }else{
            operacio = operacio / Integer.parseInt(numeros1.getText());
        }
        numeros1.setText(numeros1.getText() + "/");
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
        numeros2.setText(String.valueOf(operacio));
    }


}