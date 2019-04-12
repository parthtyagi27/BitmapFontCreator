package gui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class MainWindowController
{
    @FXML
    private TextField fontFileTextField;
    @FXML
    public void pickFontFile()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Font File");
        try
        {
            MainWindow.path = fileChooser.showOpenDialog(MainWindow.primaryStage).getPath();
            fontFileTextField.setText(MainWindow.path);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
