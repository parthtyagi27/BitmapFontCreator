package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import sun.applet.Main;

public class MainWindowController
{
    @FXML
    private TextField fontSizeTextField;
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
    @FXML
    public void createFont()
    {
        try
        {
            if(MainWindow.path == "" || MainWindow.path == null)
            {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setContentText("Pick a font file");
                error.show();
            }else
            {
                int size = Integer.parseInt(fontSizeTextField.getText());
                if (size < 1)
                {
                    Alert error = new Alert(Alert.AlertType.ERROR);
                    error.setContentText("Pick a font size greater than 1");
                    error.show();
                } else
                {
                    MainWindow.fontSize = size;
                    MainWindow.generateFont();
                }
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
