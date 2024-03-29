package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MaestriClientGUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hello, JavaFX, running on Java.");
        Scene scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}
