package com.samp.guiv2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //First Page
       Parent root  = FXMLLoader.load(getClass().getResource("Main.fxml"));

        //Create Scenes
        Scene scene = new Scene(root);
        //Scene scene1 = new Scene(root);

        //Add Image-File in Resource file
        Image lakpaLLC = new Image("xoxo.png");
        //Pass Image to Stage(Windows Label Pic)
        stage.getIcons().add(lakpaLLC);



        //Pass stylesheet (CSS) to scene
        //scene.getStylesheets().add(getClass().getResource("App.css").toExternalForm());

        //For multiple scenes
        String css =this.getClass().getResource("App.css").toExternalForm();

        scene.getStylesheets().add(css);
        //scene1.getStylesheets().add(css);

        //Pass Scene to stage
        stage.setScene(scene);
        //Set Titles
        stage.setTitle("GUI2Demo!");


        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}