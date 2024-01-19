package com.iesochoa.guillermogomez.ejercicio00;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hola-mundo.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600 , 600);
        stage.setTitle("Práctia 00: Hola Mundo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}