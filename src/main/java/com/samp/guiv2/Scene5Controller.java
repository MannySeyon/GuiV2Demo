package com.samp.guiv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class Scene5Controller implements Initializable {
    @FXML
    private Button progressButton;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label progressLabel;
    double progress;
    public void incrementProgress() {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    progressBar.setStyle("-fx-accent:indigo;");
    }
}
