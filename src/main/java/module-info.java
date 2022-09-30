module com.example.zadanie0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zadanie0 to javafx.fxml;
    exports com.example.zadanie0;
}