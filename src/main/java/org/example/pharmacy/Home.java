package org.example.pharmacy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Home extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Home.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        primaryStage.setScene(scene);
        primaryStage.fullScreenExitHintProperty().addListener((observable, oldValue, newValue) -> {

        });
        primaryStage.setTitle("Pharmacy");
        primaryStage.show();


    }
}
