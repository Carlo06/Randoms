package womencontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class WomenCheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8,  price1, price2, price3, price4, price5, price6, price7, price8, total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8;

    private String[] quantity = { "1", "2", "3", "4" };


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(WomenController.Bcap.getProductName());
        price1.setText(Double.toString(WomenController.Bcap.getProductPrice()));
        Image beigeCap = new Image(WomenController.Bcap.getProductImage());
        img1.setImage(beigeCap);

        name2.setText(WomenController.mcoq.getProductName());
        price2.setText(Double.toString(WomenController.mcoq.getProductPrice()));
        Image MiniCoquette = new Image(WomenController.mcoq.getProductImage());
        img2.setImage(MiniCoquette);

        name3.setText(WomenController.Shoes.getProductName());
        price3.setText(Double.toString(WomenController.Shoes.getProductPrice()));
        Image BeigeShoes = new Image(WomenController.Shoes.getProductImage());
        img3.setImage(BeigeShoes);

        name4.setText(WomenController.cap.getProductName());
        price4.setText(Double.toString(WomenController.cap.getProductPrice()));
        Image Bucket = new Image(WomenController.cap.getProductImage());
        img4.setImage(Bucket);

        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);

        // Set total initial amount
        double totalInitialAmount = 0.00;
        if (WomenController.mcoq.getProductStatus() || WomenController.Bcap.getProductStatus() || WomenController.Shoes.getProductStatus()) {
            totalInitialAmount = Double.parseDouble(choicebox1.getValue()) * WomenController.Bcap.getProductPrice() +
            +Double.parseDouble(choicebox2.getValue()) * WomenController.mcoq.getProductPrice()
            + Double.parseDouble(choicebox3.getValue()) * WomenController.Shoes.getProductPrice()
            + Double.parseDouble(choicebox4.getValue()) * WomenController.cap.getProductPrice();
        }

        if (WomenController.mcoq.getProductStatus() || WomenController.Bcap.getProductStatus() || WomenController.Shoes.getProductStatus() || WomenController.cap.getProductStatus() ) {
            totalInitialAmount = Double.parseDouble(choicebox1.getValue()) * WomenController.Bcap.getProductPrice() +
            +Double.parseDouble(choicebox2.getValue()) * WomenController.mcoq.getProductPrice()
            + Double.parseDouble(choicebox3.getValue()) * WomenController.Shoes.getProductPrice() +
            Double.parseDouble(choicebox4.getValue()) * WomenController.cap.getProductPrice() ;
        }
     
        // Display total initial amount in total label
        total.setText(Double.toString(totalInitialAmount));
    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;


        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (WomenController.Bcap.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            WomenController.Bcap.setProductQuantity(qty);
            item1Amount = WomenController.Bcap.getProductPrice() * qty;
            
            if (source == choicebox1) {
                item1Amount = WomenController.Bcap.getProductPrice() * qty;
            }
        }

        if (WomenController.mcoq.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            WomenController.mcoq.setProductQuantity(qty);
            item2Amount = WomenController.mcoq.getProductPrice() * qty;
            if (source == choicebox2) {
                item2Amount = WomenController.mcoq.getProductPrice() * qty;
            }
        }

        if (WomenController.Shoes.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            WomenController.Shoes.setProductQuantity(qty);
            item3Amount = WomenController.Shoes.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = WomenController.Shoes.getProductPrice() * qty;
            }
        }

        if (WomenController.cap.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            WomenController.cap.setProductQuantity(qty);
            item4Amount = WomenController.cap.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = WomenController.cap.getProductPrice() * qty;
            }
        }



        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount;
        
        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    public void switchToReceipt(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Order.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
}
