/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author joaor
 */
public class JavaFXApplication4 extends Application {
    private static Stage stage;
    private static Scene scene1;
    private static Scene scene2;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        
        FXMLLoader loader2 = new FXMLLoader(this.getClass().getResource("FXML2.fxml"));
        Parent root2 = loader2.load();
        Scene scene2 = new Scene(root2);
        
        FXMLLoader loader1 = new FXMLLoader(this.getClass().getResource("FXMLDocument.fxml"));
        Parent root1 = loader1.load();
        Scene scene1 = new Scene(root1);
        
       
        
        
        stage.setScene(scene1);
        stage.setMaximized(true);
        stage.show();
        
        /*XMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/loginScene.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public static Stage getStage(){
        return stage;
    }
    public static void changeScreen(int num){
        switch (num){
            case 0:
                stage.close();
                stage.setScene(scene2);
                stage.setMaximized(true);
                stage.show();
                break;
            case 1:
                stage.close();
                stage.setScene(scene1);
                stage.setMaximized(true);
                stage.show();
                break;
                
        }
    }
    
    
}
