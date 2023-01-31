package com.example.formulari;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HelloControllerProjecteUF2 {
    @FXML
    public Label resultatsNom;
    @FXML
    public TextField nombuscar;
    @FXML
    public Label resultatsTelefon;
    public Label separador;
    @FXML
    private TextField nom;
    @FXML
    private TextField telefon;
    @FXML
    private Label registed;

    ArrayList<String> text = new ArrayList<>();

    ArrayList<String> nomContactes = new ArrayList<>();



    @FXML
    protected void submitbutton() throws IOException, NoSuchAlgorithmException {
        try {
            FileReader fr = new FileReader("agenda");
            BufferedReader br = new BufferedReader(fr);
            while (true){
                String linea = br.readLine();
                if (linea == null) break;
                String [] partbona = linea.split("-");
                nomContactes.add(partbona[0]);
            }

            if (nomContactes.contains(nom.getText().toUpperCase())) {
                registed.setText("Ja hi ha un contacte amb aquest nom");
            }else {

                FileWriter escriptor = new FileWriter("agenda", true);
                String nomMays = nom.getText().toUpperCase();
                escriptor.append(nomMays);
                escriptor.append("-");
                try {
                    Integer.parseInt(telefon.getText());
                    escriptor.append(telefon.getText());
                    escriptor.append("\n");
                    escriptor.close();
                    registed.setText("Contacte agregat correctament");
                    nomContactes.clear();
                } catch (NumberFormatException e) {
                    registed.setText("Aquest format de número de telefon no és correcte");
                    return;
                }
            }
        }catch(Exception ignored) {
        }
    }

    @FXML
    public void buscarbutton(ActionEvent actionEvent) {
        try{
            boolean sino = false;
            StringBuilder grupContactesNom = new StringBuilder();
            StringBuilder grupContactesTelefon = new StringBuilder();
            FileReader fr = new FileReader("agenda");
            BufferedReader br = new BufferedReader(fr);
            String contacte = nombuscar.getText();
            contacte = contacte.toUpperCase();
            String line;
            while ((line = br.readLine()) != null){
                if (line.contains(contacte)) {
                    int index = line.indexOf("-");
                    if (index != -1) {
                        grupContactesNom.append(line, 0, index).append("\n");
                        grupContactesTelefon.append(line.substring(index + 1)).append("\n");
                        sino = true;
                    }
                }
            } if(sino){
                resultatsNom.setText(grupContactesNom.toString());
                resultatsTelefon.setText(grupContactesTelefon.toString());
                separador.setText("   ");
            }else{
                resultatsNom.setText("No s'ha trobat cap contacte");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
