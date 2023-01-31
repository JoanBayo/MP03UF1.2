package com.example.formulari;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloControllerA22 {


    @FXML
    private TextField user;
    @FXML
    private TextField password;
    @FXML
    private Label loged;

    ArrayList<String> text = new ArrayList<>();

    @FXML
    protected void logbutton() throws IOException, NoSuchAlgorithmException {
        try {
            File lector = new File("secret");
            Scanner teclat = new Scanner(lector);
            while (teclat.hasNextLine()) {
                text.add(teclat.nextLine());
            }
            teclat.close();
        }catch(Exception e) {
        }
//      ENCRIPTEM LA CONTRASENYA PER COMPARARLA EN LATRA ENCRIPTADA
        MessageDigest m = MessageDigest.getInstance("MD5");
        String pwd = password.getText();
        m.update(pwd.getBytes());
        byte[] bytes = m.digest();
        StringBuilder s = new StringBuilder();
        for(int i=0; i< bytes.length ;i++) {
            s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        String encryptedpassword = s.toString();
        String userPassword = user.getText() + "-" + encryptedpassword;

        if(text.contains(userPassword)){
            loged.setText("Usuari logejat correctament");
        }else{
            loged.setText("Aquest usuari no és troba a la BD");
        }
    }
}