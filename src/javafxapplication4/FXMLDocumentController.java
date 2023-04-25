/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication4;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 *
 * @author joaor
 */
public class FXMLDocumentController implements Initializable {
    private MediaPlayer mediaplayer;
    
    @FXML
    private MediaView mediaview;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    Media media = new Media("file:///C:/temp/teste.mp4");
    mediaplayer = new MediaPlayer(media);
    mediaview.setMediaPlayer(mediaplayer);
    
    DoubleProperty width = mediaview.fitWidthProperty();
    DoubleProperty height = mediaview.fitHeightProperty();
    
    width.bind(Bindings.selectDouble(mediaview.sceneProperty(), "width"));
    height.bind(Bindings.selectDouble(mediaview.sceneProperty(), "height"));
    mediaplayer.play();
    mediaplayer.setOnEndOfMedia(new Runnable(){
        @Override
        public void run() {
            /*Media media = new Media("file:///C:/temp/testei.mp4");
            mediaplayer = new MediaPlayer(media);
            mediaview.setMediaPlayer(mediaplayer);
            mediaplayer.play();*/
            JavaFXApplication4.changeScreen(0);
        }
    });
    
    }   
    
    public void test() {
    Media media = new Media("file:///C:/temp/teste.mp4");
    mediaplayer = new MediaPlayer(media);
    mediaview.setMediaPlayer(mediaplayer);
    mediaplayer.play();
    }
}
