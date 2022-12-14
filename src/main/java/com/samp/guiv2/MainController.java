package com.samp.guiv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;


//Controller Class with methods for Functionality
public class MainController {

    @FXML
    public Button switchToScene3;
    @FXML
    public Button switchToScene2;

    @FXML
   private Label titleLabel;
    @FXML
    private Label circleLabel;

    @FXML
    private AnchorPane anchorPane;
    //FXML Loader passes Values into Controller class
      private Stage stage;
      private Scene scene;

      private Parent root;
    @FXML
    private Circle myCircle;
    private double x;
    private double y;

        //Methods For Action Events
    public void UP(ActionEvent e){
      //System.out.println("UP");
        myCircle.setCenterY(y-=10);
  }
    public void Down(ActionEvent e){
        //System.out.println("Down");
        myCircle.setCenterY(y+=10);
    }
    public void Left(ActionEvent e){
        //System.out.println("Left");
        myCircle.setCenterX(x-=10);
    }

    public void Right(ActionEvent e){
        //System.out.println("Right");
        myCircle.setCenterX(x+=10);
    }


        //Method to switch scenes
         @FXML
         public void switchToScene2(ActionEvent event) throws IOException {
            Parent root  = FXMLLoader.load(getClass().getResource("Scene2.fxml"));

            //get Source cast to a node //Pass node to Stage
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

            //Pass the new fxml path to scene variable
            scene = new Scene(root, Color.INDIGO);
            //pass scene to stage
            stage.setScene(scene);
            stage.show();

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
    public void switchToScene4(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Scene4.fxml"));

        //get Source cast to a node //Pass node to Stage
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        //Pass the new fxml path to scene variable
        scene = new Scene(root, Color.INDIGO);
        //pass scene to stage
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void switchToScene5(ActionEvent event) throws IOException {
        Parent root  = FXMLLoader.load(getClass().getResource("Scene5.fxml"));

        //get Source cast to a node //Pass node to Stage
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        //Pass the new fxml path to scene variable
        scene = new Scene(root, Color.INDIGO);
        //pass scene to stage
        stage.setScene(scene);
        stage.show();

    }

}
