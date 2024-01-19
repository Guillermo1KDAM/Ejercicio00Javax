module com.iesochoa.guillermogomez.ejercicio00 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iesochoa.guillermogomez.ejercicio00 to javafx.fxml;
    exports com.iesochoa.guillermogomez.ejercicio00;
}