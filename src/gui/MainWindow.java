package gui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;

public class MainWindow extends Application
{
    public static final int WIDTH = 525, HEIGHT = 400;
    public static Stage primaryStage;
    public static String path;
    public static int fontSize;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        MainWindow.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("BitmapFontCreator");
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
    }

    public static void generateFont() throws Exception
    {
        Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(path));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
