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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;

public class LightController implements Initializable {

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, price1, price2, price3, price4, price5, price6, price7, price8;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== BEDROOM LAMP ==================//
        name1.setText(LoginController.blamp.getProductName());
        price1.setText(Double.toString(LoginController.blamp.getProductPrice()));
        Image bedroomLamp = new Image(LoginController.blamp.getProductImage());
        img1.setImage(bedroomLamp);

        // ============== CEILING LAMP ==================//

        name2.setText(LoginController.clamp.getProductName());
        price2.setText(Double.toString(LoginController.clamp.getProductPrice()));

        Image ceilingLamp = new Image(LoginController.clamp.getProductImage());
        img2.setImage(ceilingLamp);

        // ============== WALL LAMP ==================//

        name3.setText(LoginController.wlamp.getProductName());
        price3.setText(Double.toString(LoginController.wlamp.getProductPrice()));
        Image wallLamp = new Image(LoginController.wlamp.getProductImage());
        img3.setImage(wallLamp);

        // ============== Beige Bucket ==================//

        name4.setText(LoginController.bbucket.getProductName());
        price4.setText(Double.toString(LoginController.bbucket.getProductPrice()));
        Image Beige = new Image(LoginController.bbucket.getProductImage());
        img4.setImage(Beige);

        // ============== Cargo Longsleeve ==================//

        name5.setText(LoginController.csleeve.getProductName());
        price5.setText(Double.toString(LoginController.csleeve.getProductPrice()));
        Image cargoSleeve = new Image(LoginController.csleeve.getProductImage());
        img5.setImage(cargoSleeve);

        // ============== Cargo Longsleeve ==================//

        name6.setText(LoginController.mdress.getProductName());
        price6.setText(Double.toString(LoginController.mdress.getProductPrice()));
        Image Dress = new Image(LoginController.mdress.getProductImage());
        img6.setImage(Dress);


    }       

    public void buy(ActionEvent event) throws IOException {     

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            LoginController.blamp.setProductStatus(true);
            LoginController.blamp.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == button2) {
            LoginController.clamp.setProductStatus(true);
            LoginController.clamp.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == button3) {
            LoginController.wlamp.setProductStatus(true);
            LoginController.wlamp.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == button4) {
            LoginController.bbucket.setProductStatus(true);
            LoginController.bbucket.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane4);
        }

        else if (sourceButton == button5) {
            LoginController.csleeve.setProductStatus(true);
            LoginController.csleeve.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane5);
        }

        else if (sourceButton == button6) {
            LoginController.mdress.setProductStatus(true);
            LoginController.mdress.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane6);
        }


        LoginController.cart.showItems();
    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        // Load items to cart before switching to checkout page
        LoginController.checkoutController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in checkout page
        LoginController.checkoutController.getInitialAmount();

        Scene scene = new Scene(LoginController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Checkout.fxml
    public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
