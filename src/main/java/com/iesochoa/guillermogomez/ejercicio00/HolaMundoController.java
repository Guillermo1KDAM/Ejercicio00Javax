package com.iesochoa.guillermogomez.ejercicio00;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HolaMundoController {

    @FXML
    private Label lbSaludo;

    @FXML
    private Button btsaludo;

    @FXML
    private TextField tfSaludo;

    @FXML
    void onClickBtSaludo(ActionEvent event) {
        lbSaludo.setText("Hola " + tfSaludo.getText());

    }

}
