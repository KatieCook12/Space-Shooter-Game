package com.example.space_shooter_game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;

public class shipChooser {

    @FXML
    Label shipType;

    @FXML
    ImageView shipImage;

    @FXML
    RadioButton radioButton1, radioButton2;

    private Stage stage;
    private Scene scene;
    private Parent root;

    Image greenShip = new Image(getClass().getResourceAsStream("playerShip2_green.png"));
    Image blueShip  = new Image(getClass().getResourceAsStream("playerShip2_blue.png"));

    public void getShip(ActionEvent event){
        if(radioButton1.isSelected()){
            shipImage.setImage(greenShip);
            shipType.setText("Green Ship");
        }
        else if(radioButton2.isSelected()){
            shipImage.setImage(blueShip);
            shipType.setText("Blue Ship");
        }
    }

    public void switchToHowToPlay(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("How_To_Play.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPlayers(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Players.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToHighScores(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("High_Scores.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void getScene(ActionEvent event) throws IOException {

        Image ship = shipImage.getImage();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        root = loader.load();

        Game scene2Controller = loader.getController();
        scene2Controller.displayName(ship);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
