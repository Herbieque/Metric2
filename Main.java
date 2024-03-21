package hellofx;
import javafx.scene.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {
    String conversions [] = {"kg to lbs", "cm to in", "km to miles", "Litres to Gallons"};
    TextField text2; 
    ComboBox box;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Button button = new Button("Enter");
        AnchorPane root = new AnchorPane(); 
        AnchorPane.setBottomAnchor(button, 15.0);
        AnchorPane.setRightAnchor(button, 175.0);
        button btn = new button(); 
        button.setOnAction(btn);
        text2 = new TextField(); 
        AnchorPane.setLeftAnchor(text2, 10.0); 
        AnchorPane.setBottomAnchor(text2, 220.0);
        Button button2 = new Button("Clear");
        AnchorPane.setBottomAnchor(button2, 15.0);
        AnchorPane.setRightAnchor(button2, 220.0);
        button2 btn2 = new button2(); 
        button2.setOnAction(btn2);
         box = new ComboBox(FXCollections.observableArrayList(conversions)); 
        AnchorPane.setTopAnchor(box, 10.0);
        AnchorPane.setLeftAnchor(box, 10.0);  
        root.getChildren().addAll(button, text2, button2, box);
        primaryStage.setTitle("Metric Converter");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show(); 

}

    public static void main(String[] args) {
        launch(args);
    }

    class button implements EventHandler <ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            String input2; 
            String result; 
        String input = (String) box.getValue();     
       if (input == "kg to lbs"){
             input2 = text2.getText(); 
             double num2 = Double.parseDouble(input2); 
             double kg = num2 * 2.205; 
           result = Double.toString(kg); 
             text2.setText("Amount in lbs:" + result); 
        }
        else if (input == "cm to in"){
            input2 = text2.getText(); 
            double num2 = Double.parseDouble(input2);  
            double cm = num2 / 2.54; 
          result = Double.toString(cm); 
            text2.setText("Amount in inches:" + result);
        }

        else if (input == "km to miles"){ 
            input2 = text2.getText(); 
            double num2 = Double.parseDouble(input2);  
            double km = num2 / 1.609; 
          result = Double.toString(km); 
            text2.setText("Amount in miles:" + result); 
        }
        
        else if (input == "Litres to Gallons"){
            input2 = text2.getText(); 
            double num2 = Double.parseDouble(input2); 
            double Liters = num2 / 3.785; 
          result = Double.toString(Liters); 
            text2.setText("Amount in Gallons:" + result);
        }
        }

}

class button2 implements EventHandler <ActionEvent>{
    @Override
    public void handle(ActionEvent event) {
        text2.clear(); 
    }

}

}

