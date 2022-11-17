package com.example.otisapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class HelloController {
    @FXML
    private GridPane gridPane = new GridPane();
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea textArea = new TextArea();

    @FXML
    protected void onAdd() {
        gridPane.getRowConstraints().add(new RowConstraints(70));
    }
    @FXML
    protected void getText(){

    }
}