package com.samp.guiv2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;
public class Scene2Controller {

   @FXML
    private Button switchToScene2;
    @FXML
    private Button switchToScene3;

    private Stage stage;
    private Scene scene;

    private Parent root;

    @FXML
    private CheckBox meCheckBox;
    @FXML
    private Label meLabel;
    @FXML
    ImageView meImageView;

//Get resource as String Stream
    Image ImageIchii = new Image(getClass().getResourceAsStream("/xoxo.png"));
    Image ImageNee= new Image(getClass().getResourceAsStream("/Summit Fin Corp.jpg"));



    public void change(ActionEvent event){
        if(meCheckBox.isSelected()){
            meLabel.setText("Ichii!");
            meImageView.setImage(ImageNee);
        }
        else {
            meLabel.setText("Nii!!");
            meImageView.setImage(ImageIchii);
        }
    }
    @FXML
    public void switchToScene3(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Scene3.fxml"));

        //get Source cast to a node //Pass node to Stage
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        //Pass the new fxml path to scene variable
        scene = new Scene(root, Color.DARKCYAN);
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