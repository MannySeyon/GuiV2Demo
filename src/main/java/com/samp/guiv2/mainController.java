package com.samp.guiv2;

import com.almasb.fxgl.entity.action.Action;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class mainController {
  public void UP(ActionEvent e){
      System.out.println("UP");
  }

    public void Down(ActionEvent e1){
        System.out.println("Down");
    }
    public void Left(ActionEvent e2){
        System.out.println("Left");
    }
    public void Right(ActionEvent e3){
        System.out.println("Right");
    }


}