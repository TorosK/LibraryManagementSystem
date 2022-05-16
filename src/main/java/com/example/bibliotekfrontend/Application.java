package com.example.bibliotekfrontend;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class Application extends javafx.application.Application {

    private static Stage newStage;

    @Override
    public void start(Stage stage) throws IOException {
        newStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("firstPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Best Library Evah");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource(fxml)));
        newStage.getScene().setRoot(pane);

    }

    public void changeToFirstPage()throws IOException{
        start(newStage);

    }

    public static void main(String[] args) {

        launch();
    }
}