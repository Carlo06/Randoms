package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ChooseGenderController implements Initializable{
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label namelabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        namelabel.setText(LoginController.username);
    }

    //Selects the StoreName men scene
    public void switchToMen(ActionEvent event) throws IOException {
       root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
     public void switchToWomen(ActionEvent event) throws IOException {
       root = FXMLLoader.load(getClass().getResource("/view/Women.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }
}
