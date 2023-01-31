package com.example.formulari;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloControllerA3 {
    @FXML
    public ImageView logo;
    @FXML
    private Label resultat;
    @FXML
    private TextField url;

     
    @FXML
    protected void refresh() {
        String cadenaAux = url.getText();
        Image imatge1 = new Image(cadenaAux);
        logo.setImage(imatge1);
    }


//    @FXML
//    protected void boto2() {
//        String cadenaAux = "Adeu ";
//        cadenaAux += nom.getText();
//        text2.setText(cadenaAux);
//    }
}