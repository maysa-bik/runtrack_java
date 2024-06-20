package Jour05.job01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Button quitButton = new Button("Quitter");
        quitButton.setOnAction(e -> System.exit(0));
        root.setBottom(quitButton);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Fenêtre avec BorderLayout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
