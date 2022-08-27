package com.samp.guiv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

//Initialize controller after root node has been processed
public class Scene4Controller implements Initializable {
    @FXML
    private ChoiceBox <String> choiceBox1;
    private String[] food ={"pizza", "sushi","pasta","ramen"};
    @FXML
    private ChoiceBox <String> choiceBox2;

    private String[] clothes ={"shoes", "pants","shirt","hat"};

    @FXML
    private Label choiceBoxLabel;
    @FXML
    private Label choiceBoxLabel2;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label label;
    @FXML
    private Pane pane;
    @FXML
    private ColorPicker colorPicker;

    public void getDate(ActionEvent event){
        LocalDate date = datePicker.getValue();
        //("MMM-dd-yyyy"))-To show month
        String myFormattedDate = date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        label.setText((myFormattedDate));
    }
    public void colorPick(ActionEvent event) {
        //Set Color variable to color picker
        Color myColor = colorPicker.getValue();
        //set Pane Background to a new color-set by the picker
        //(myColor, null, null))); Alternative method
        pane.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));
    }
    //Initialize any data after root node is processed in this method
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //Add Array of data into the choice boxes
        this.choiceBox1.getItems().addAll(food);
        this.choiceBox2.getItems().addAll(clothes);
        // ::-Method Reference operator //Set choice
        choiceBox1.setOnAction(this::getFood);
        choiceBox2.setOnAction(this::getFood);
    }
    @FXML
    public void getFood(ActionEvent event){
        String myFood = choiceBox1.getValue();
        choiceBoxLabel.setText(myFood);
        String myClothes= choiceBox2.getValue();
        choiceBoxLabel2.setText(myClothes);
    }
}


