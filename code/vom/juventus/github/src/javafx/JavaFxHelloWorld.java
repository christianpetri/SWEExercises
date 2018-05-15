package code.vom.juventus.github.src.javafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFxHelloWorld extends Application {

    final static String GREEN = "#00ff00";
    final static String YELLOW = "#d6ff00";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text();
        text.setFont(new Font(45));
        text.setX(50);
        text.setY(150);
        text.setText("Hello World");

        Button button = new Button();
        button.setText("Change color");

        Label output = new Label("Hintergrund: Grün");

        VBox root = new VBox(20);
        root.setStyle("-fx-background-color: " + GREEN);
        ObservableList list = root.getChildren();
        list.add(text);
        list.add(button);
        list.add(output);

        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if(root.getStyle().contains(GREEN)) {
                    root.setStyle("-fx-background-color: " + YELLOW);
                    output.setText("Hintergrund: Gelb");
                } else {
                    root.setStyle("-fx-background-color: " + GREEN);
                    output.setText("Hintergrund: Grün");
                }
            }
        };
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

        Scene scene = new Scene(root ,600, 300);
        scene.getStylesheets().add("javafx/index.css");

        primaryStage.setTitle("Hello World Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
