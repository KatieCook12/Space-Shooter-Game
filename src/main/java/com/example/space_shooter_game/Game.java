package com.example.space_shooter_game;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Game {

    //meteor
    //bullets fired
    //score
    //left key
    //right key
    //space key
    //background image


    @FXML
    ImageView finalShip;

    public void displayName(Image ship){

        finalShip.setImage(ship);
    }

}
