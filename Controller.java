package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.io.IOException;

public class Controller extends Main  {
    @FXML
    TextArea textArea;

    @FXML
    javafx.scene.control.TextField textField;

    @FXML
    VBox vbox;



    public void sendMsg(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();

    }

    public void Exit(ActionEvent actionEvent) {

        System.exit(0);
    }

    boolean flag = true;
    public void change(ActionEvent actionEvent) throws IOException {
        //
        System.out.println("You clicked me!");

        if(flag) {
            vbox.getStylesheets().clear();
            vbox.getStylesheets().add(getClass().getResource("dark.css").toExternalForm());
            flag = false;
        }
         else if(!flag) {
            vbox.getStylesheets().clear();
            vbox.getStylesheets().add(getClass().getResource("css.css").toExternalForm());
            flag = true;
        }
       // flag = true ? false : true;
    }
}

