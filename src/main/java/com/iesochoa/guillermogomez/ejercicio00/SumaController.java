package com.iesochoa.guillermogomez.ejercicio00;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumaController {

    @FXML
    private TextField num1;

    @FXML
    private Button btSuma;

    @FXML
    private TextField num2;

    @FXML
    private Label lbResultado;

    @FXML
    void onClick(ActionEvent event) {
        lbSaludo.setText("Hola " + tfSaludo.getText());
        lbResultado.setText(String.valueOf(suma(num1, num2)));
    }
    public int suma(int num1, int num2){
        int sumaNumeros = num1 +num2;
        return sumaNumeros;
    }

}