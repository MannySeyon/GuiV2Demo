package com.samp.guiv2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;
public class Scene3Controller {
    public ToggleGroup Food;
    @FXML
    private Button switchToMain;
    @FXML
    private Button switchToScene2;
    @FXML
    private Label meRadioLabel;
    @FXML
    private RadioButton rButton0, rButton1, rButton2;
    private Stage stage;
    private Scene scene;

    private Parent root;

    public void getFood(ActionEvent event) {

        if (rButton0.isSelected()) {
            meRadioLabel.setText("You selected:Pizza");
        } else if (rButton1.isSelected()) {
            meRadioLabel.setText("You selected:Ramen-Udon or Pho of course ");
        } else {
            meRadioLabel.setText("You selected: Sushi");
        }
    }
    @FXML
    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));

        //get Source cast to a node //Pass node to Stage
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //Pass the new fxml path to scene variable
        scene = new Scene(root, Color.INDIGO);
        //pass scene to stage
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void switchToMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Maincc.fxml"));

        //get Source cast to a node //Pass node to Stage
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //Pass the new fxml path to scene variable
        scene = new Scene(root);
        //pass scene to stage
        stage.setScene(scene);
        stage.show();

    }
}


