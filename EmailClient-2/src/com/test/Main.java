package com.test;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @FXML
    public void buttonAction(){
        System.out.println("Clicked the button");
    }
    @Override
    public void start(Stage stage) throws Exception {
       // Parent parent = FXMLLoader.load(getClass().getResource("main.fxml"));

       // Scene scene = new Scene(parent, 300, 250);
        //stage.setScene(scene);

        //stage.show();
        stage.setTitle("sendEmail");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("main.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
