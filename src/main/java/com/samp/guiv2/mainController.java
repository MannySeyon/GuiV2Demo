package com.samp.guiv2;

import com.almasb.fxgl.entity.action.Action;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

//Controller Class with methods for Functionality
public class mainController {
  //FXML Loader passes Values into Controller class
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


}