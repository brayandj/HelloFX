/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdojo.intro;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author BrayanD
 */
public class ImprovedHelloFXApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Label nameLbl = new Label("Ingresa tu nombre");
        TextField nameFld = new TextField();
        
        Label msg = new Label();
        msg.setStyle("-fx-text-fill: blue;");
        
        Button sayHelloBtn = new Button("Hola");
        Button exitBtn = new Button("Salir");
        sayHelloBtn.setOnAction(eventH -> {
            String name = nameFld.getText();
            if (name.trim().length() > 0) {
                msg.setText("Hola " + name);
            } else {
                msg.setText("Hola");
            }
        });
        
        exitBtn.setOnAction(eventH -> Platform.exit());
        
        VBox root = new VBox();
        root.setSpacing(5);
        root.getChildren().addAll(nameLbl, nameFld, msg, sayHelloBtn, exitBtn);
        
        Scene scene = new Scene(root, 350, 150);
        stage.setScene(scene);
        stage.setTitle("Aplicación Hola JavaFX mejorada");
        stage.show();
    }
    
}
