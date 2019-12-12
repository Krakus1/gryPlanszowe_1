package planszowki;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class Controller {
    @FXML
    AnchorPane mainWindow;
    Stage primaryStage;

    public void chinczyk() throws Exception {



        Parent root = FXMLLoader.load(getClass().getResource("chinczyk.fxml"));
        Stage stage = new Stage();
//        stage.initModality(Modality.APPLICATION_MODAL);
//        stage.initOwner(primaryStage.getScene().getWindow());
        stage.setScene(new Scene(root, 400, 200));
//        Parent root = FXMLLoader.load(getClass().getResource("chinczyk.fxml"));
        stage.setTitle("Chinczyk");

//        stage.initOwner(primaryStage.getScene().getWindow());
//        stage.setScene(new Scene(content));
        stage.show();
    }

}


