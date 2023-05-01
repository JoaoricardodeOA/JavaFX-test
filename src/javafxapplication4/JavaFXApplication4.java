/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package javafxapplication4;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
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
    private static Stage anotherstage;
    private static Timer timer;
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        
        FXMLLoader loader2 = new FXMLLoader(this.getClass().getResource("FXML2.fxml"));
        Parent root2 = loader2.load();
        Scene scene2 = new Scene(root2);
        
        FXMLLoader loader1 = new FXMLLoader(this.getClass().getResource("FXMLDocument.fxml"));
        Parent root1 = loader1.load();
        Scene scene1 = new Scene(root1);
        
       
        
        stage.setScene(scene2);
        stage.setMaximized(true);
        stage.show();
        
        anotherstage = new Stage();
        anotherstage.setScene(scene1);
        anotherstage.setMaximized(true);
        anotherstage.show();
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
    public static void changeScreen(int num) {
        try{
        switch (num){
            case 0:
                //stage.close();
                stage.requestFocus();
                TimeUnit.SECONDS.sleep(2l);
                anotherstage.requestFocus();
                //stage.setScene(scene2);
                //stage.setMaximized(true);
                //stage.show();
                break;
            case 1:
                //stage.close();
                anotherstage.requestFocus();
                //stage.setMaximized(true);
                //stage.show();
                break;
                
        }
        }catch( InterruptedException e){
            
        }
    }
    
    
    
}
