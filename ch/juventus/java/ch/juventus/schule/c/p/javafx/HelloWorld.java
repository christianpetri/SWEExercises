package ch.juventus.java.ch.juventus.schule.c.p.javafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class HelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
        /*
        Text text = new Text();
        text.setFont(new Font(45));
        text.setX(50);
        text.setY(150);
        text.setText("Hello World");


        Button button = new Button();
        button.setStyle("-fx-background-color: red; -fx-text-fill: white");
        button.setText("Change color");
        button.setTranslateX(50);
        button.setTranslateY(50);
        // Group sample:
        Group root = new Group();

        ObservableList list = root.getChildren();
        list.add(text);
        list.add(button);

        Scene scene = new Scene(root, 600, 300, Color.GREEN); //, Color.green
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //Node node = e.getTarget();
                if(scene.getFill() == Color.GREEN) {
                    scene.setFill(Color.RED);

                }  else if (scene.getFill() == Color.RED)
                    scene.setFill(Color.GREEN);
            }
        };

        button.addEventHandler( MouseEvent.MOUSE_CLICKED, eventHandler );
        */
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }

}
