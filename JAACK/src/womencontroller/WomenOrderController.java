package womencontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;


public class WomenOrderController implements Initializable {

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8,
     lineamount1, lineamount2, lineamount3, lineamount4, lineamount5, lineamount6, lineamount7, lineamount8, totalamount;
    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;
    
    public void initialize(URL location, ResourceBundle resources) {

         if (WomenController.Bcap.getProductStatus()){
            name1.setText(WomenController.Bcap.getProductName());
            qty1.setText(Double.toString(WomenController.Bcap.getProductQuantity()));
            name1.setVisible(true);
            qty1.setVisible(true);
            lineamount1.setVisible(true);
            lineamount1.setText(Double.toString(WomenController.Bcap.getProductPrice()*WomenController.Bcap.getProductQuantity()));
  
         }
            if (WomenController.mcoq.getProductStatus()){
             name2.setText(WomenController.mcoq.getProductName());
             qty2.setText(Double.toString(WomenController.mcoq.getProductQuantity()));
             name2.setVisible(true);
             qty2.setVisible(true);
             lineamount2.setVisible(true);
             lineamount2.setText(Double.toString(WomenController.mcoq.getProductPrice()*WomenController.mcoq.getProductQuantity()));

   
        }
            if (WomenController.Shoes.getProductStatus()){
            name3.setText(WomenController.Shoes.getProductName());
            qty3.setText(Double.toString(WomenController.Shoes.getProductQuantity()));
            name3.setVisible(true);
            qty3.setVisible(true);
            lineamount3.setVisible(true);
            lineamount3.setText(Double.toString(WomenController.Shoes.getProductPrice()*WomenController.Shoes.getProductQuantity()));

        }

        if (WomenController.cap.getProductStatus()){
            name4.setText(WomenController.cap.getProductName());
            qty4.setText(Double.toString(WomenController.cap.getProductQuantity()));
            name4.setVisible(true);
            qty4.setVisible(true);
            lineamount4.setVisible(true);
            lineamount4.setText(Double.toString(WomenController.cap.getProductPrice()*WomenController.cap.getProductQuantity()));

        
        }

        
            double amount1 = WomenController.Bcap.getProductPrice() * WomenController.Bcap.getProductQuantity();
            double amount2 = WomenController.mcoq.getProductPrice() * WomenController.mcoq.getProductQuantity();
            double amount3 = WomenController.Shoes.getProductPrice() * WomenController.Shoes.getProductQuantity();
            double amount4 = WomenController.cap.getProductPrice() * WomenController.cap.getProductQuantity();
            double finalamount = amount1 + amount2 + amount3 + amount4;
            totalamount.setText(Double.toString(finalamount));
            totalamount.setVisible(true);
        }

    public void switchToCheckout(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
}

