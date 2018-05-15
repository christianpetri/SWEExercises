package code.vom.juventus.github.src.javafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavafxSample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creating a line object
//        Line line = new Line();
        //Setting the properties to a line
//        line.setStartX(100.0);
//        line.setStartY(150.0);
//        line.setEndX(500.0);
//        line.setEndY(150.0);
        //Creating an image
//        Image image = new Image("https://www.tutorialspoint.com/green/images/logo.png");
        //Setting the image view
//        ImageView imageView = new ImageView(image);
        //Setting the position of the image
//        imageView.setX(100);
//        imageView.setY(70);
        //setting the fit height and width of the image view
//        imageView.setFitHeight(200);
//        imageView.setFitWidth(400);
        //Setting the preserve ratio of the image view
//        imageView.setPreserveRatio(true);
//        Glow glow = new Glow();
//        glow.setLevel(0.9);
//        imageView.setEffect(glow);
        //Creating a Group
        Group root = new Group();
        //Retrieving the observable list object
        ObservableList list = root.getChildren();
//        list.add(line);
//        list.add(imageView);
        //Creating a Scene by passing the group object, height and width
        Scene scene = new Scene(root ,600, 300);
        //setting color to the scene
//        scene.setFill(Color.BROWN);
        //Setting the title to Stage.
        primaryStage.setTitle("Hello World Application");
        //Adding the scene to Stage
        primaryStage.setScene(scene);
        //Displaying the contents of the stage
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
