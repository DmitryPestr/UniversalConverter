package uconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/main_window.fxml"));

        Scene scene = new Scene(root, 500, 275);
        root.setStyle("-fx-background-color: grey;-fx-padding: 10px;");

        primaryStage.setTitle("Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}



