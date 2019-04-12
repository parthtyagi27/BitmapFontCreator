package gui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MainWindow extends Application
{
    public static final int WIDTH = 750, HEIGHT = 400;
    public static Stage primaryStage;
    public static String path;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        MainWindow.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("BitmapFontCreator");
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
    }

    public static void setFile()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Font File");
        String path = fileChooser.showOpenDialog(primaryStage).getAbsolutePath();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
