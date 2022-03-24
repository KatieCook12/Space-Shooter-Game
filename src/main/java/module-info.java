module com.example.text_changing_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.space_shooter_game to javafx.fxml;
    exports com.example.space_shooter_game;
}