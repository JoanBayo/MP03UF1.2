package com.example.formulari;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
public class HelloControllerA2 {


    @FXML
    private TextField user;
    @FXML
    private TextField password;

    @FXML
    private Label registed;

    @FXML
    protected void submitbutton() throws IOException, NoSuchAlgorithmException {
        FileWriter escriptor = new FileWriter("secret",true);
        escriptor.append(user.getText()).append("-");
        MessageDigest m = MessageDigest.getInstance("MD5");
        String pwd = password.getText();
        m.update(pwd.getBytes());
        byte[] bytes = m.digest();
        StringBuilder s = new StringBuilder();
        for(int i=0; i< bytes.length ;i++) {
            s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        String encryptedpassword = s.toString();
        escriptor.append(encryptedpassword);
        escriptor.append("\n");
        escriptor.close();
        registed.setText("Usuari Registrat");
    }
}