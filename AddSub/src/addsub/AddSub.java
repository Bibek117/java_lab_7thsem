/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package addsub;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class AddSub extends Application {
    
   private TextField num1Field, num2Field, resultField;

    @Override
    public void start(Stage primaryStage) {
        Label num1Label = new Label("Number 1:");
        num1Field = new TextField();

        Label num2Label = new Label("Number 2:");
        num2Field = new TextField();

        Button calculateButton = new Button("Calculate");
        calculateButton.setOnMousePressed(e -> handleAddition());
        calculateButton.setOnMouseReleased(e -> handleSubtraction());

        resultField = new TextField();
        resultField.setEditable(false);

        VBox root = new VBox(10);
        root.getChildren().addAll(num1Label, num1Field, num2Label, num2Field, calculateButton, resultField);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Addition and Subtraction");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleAddition() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 + num2;
            resultField.setText(Integer.toString(result));
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
        }
    }

    private void handleSubtraction() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 - num2;
            resultField.setText(Integer.toString(result));
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
        }
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
