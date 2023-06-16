package womencontroller;

import model.*;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import alert.AlertMaker;

public class WomenController implements Initializable {

    @FXML
    Label name1, name2, name3,name4,name5,name6,name7,name8, price1, price2, price3, price4, price5, price6, price7, price8;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    @FXML
    Button button1, button2, button3,button4,button5,button6,button7,button8, cartbutton;

    @FXML
    private Button logoutbutton;


    @FXML
    private ScrollPane scenepane;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    WomenCheckoutController womenCheckoutController = null;

    static BeigeCap Bcap = new BeigeCap();
    static MiniCoquette mcoq = new MiniCoquette();
    static BeigeShoes Shoes = new BeigeShoes();
    static Bucket cap = new Bucket();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== Ordinary Beige Cap ==================//
        Bcap.setProductName("Ordinary Beige Cap");
        name1.setText(Bcap.getProductName());

        Bcap.setProductPrice(250.00);
        price1.setText(Double.toString(Bcap.getProductPrice()));

        Bcap.setProductImage("images/cap.jpg");
        Image beigeCapImage = new Image(Bcap.getProductImage());
        img1.setImage(beigeCapImage);

        // ============== Mini Coquette ==================//

        mcoq.setProductName("Mini Coquette");
        name2.setText(mcoq.getProductName());

        mcoq.setProductPrice(699.00);
        price2.setText(Double.toString(mcoq.getProductPrice()));

        mcoq.setProductImage("images/beigeDress.jpg");
        Image MiniCoquetteImage = new Image(mcoq.getProductImage());
        img2.setImage(MiniCoquetteImage);

        // ============== Chunk Beige Shoes  ==================//
        Shoes.setProductName("Chunk Beige Shoes");
        name3.setText(Shoes.getProductName());

        Shoes.setProductPrice(2699.00);
        price3.setText(Double.toString(Shoes.getProductPrice()));

        Shoes.setProductImage("images/beigeShoes.jpg");
        Image BeigeShoesImage = new Image(Shoes.getProductImage());
        img3.setImage(BeigeShoesImage);

        // ============== Bucket Cap  ==================//
        cap.setProductName("Bucket Cap");
        name4.setText(cap.getProductName());

        cap.setProductPrice(300.00);
        price4.setText(Double.toString(cap.getProductPrice()));

        cap.setProductImage("images/Bucket.png");
        Image bucketImage = new Image(cap.getProductImage());
        img4.setImage(bucketImage);



        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            System.out.println("Oops!, there is a problem at " + e);
        }

        // Clears all items in Checkout.fxml
        womenCheckoutController = loader.getController();
        womenCheckoutController.myvbox.getChildren().removeAll(womenCheckoutController.myvbox.getChildren());
    }



    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            Bcap.setProductStatus(true);
            womenCheckoutController.addItem(womenCheckoutController.pane1);
        }

        else if (sourceButton == button2) {
            mcoq.setProductStatus(true);
            womenCheckoutController.addItem(womenCheckoutController.pane2);
        }

        else if (sourceButton == button3) {
            Shoes.setProductStatus(true);
            womenCheckoutController.addItem(womenCheckoutController.pane3);
        }

        else if (sourceButton == button4) {
            cap.setProductStatus(true);
            womenCheckoutController.addItem(womenCheckoutController.pane4);
        }

    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    //Goes back to ChooseGender
        public void switchToGenderPref(ActionEvent event) throws IOException {
       root = FXMLLoader.load(getClass().getResource("/view/ChooseGender.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }

    //logs out the program
    public void logout (ActionEvent event) {

        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to exit page!");
        alert.setContentText("Do you wish to stop shopping?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenepane.getScene().getWindow();
            System.out.println("You have successfully logged out");
            stage.close();
        } 
    }
}
