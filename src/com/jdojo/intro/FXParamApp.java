package com.jdojo.intro;


import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BrayanD
 */
public class FXParamApp extends Application{

    public static void main(String[] args) {
        Application.launch(HelloFXApp.class,args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parameters parametersApplication = this.getParameters();
        Map<String, String> namedParams = parametersApplication.getNamed();
        List<String> unnamedParams = parametersApplication.getUnnamed();
        List<String> rawParams = parametersApplication.getRaw();
        String paramStr = "Parámetros con nombre: " + namedParams + "\n"
                + "Parámetros sin nombre: " + unnamedParams + "\n" + "Parámetros  sin  procesar: " + rawParams;
        TextArea textArea = new TextArea(paramStr);
        Group root = new Group(textArea);
        stage.setScene(new Scene(root));
        stage.setTitle("Parámetros de la aplicación");
        stage.show();
    }
    
}
