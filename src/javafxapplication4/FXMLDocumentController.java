/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication4;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    private int videos;
    private int contador;
    private MediaPlayer mediaplayer;

    @FXML
    private MediaView mediaview;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        videos = 0;
        while (Files.exists(Paths.get("c:\\temp\\video" + videos + ".mp4"))) {
            videos++;
            System.out.println(videos);
        }
        System.out.println(videos + "teste ");
        Media media = new Media("file:///C:/temp/video" + contador + ".mp4");
        mediaplayer = new MediaPlayer(media);
        mediaview.setMediaPlayer(mediaplayer);

        DoubleProperty width = mediaview.fitWidthProperty();
        DoubleProperty height = mediaview.fitHeightProperty();

        width.bind(Bindings.selectDouble(mediaview.sceneProperty(), "width"));
        height.bind(Bindings.selectDouble(mediaview.sceneProperty(), "height"));
        mediaplayer.play();
        changeVideo();

    }
    public void changeVideo(){
        mediaplayer.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                /*Media media = new Media("file:///C:/temp/testei.mp4");
            mediaplayer = new MediaPlayer(media);
            mediaview.setMediaPlayer(mediaplayer);
            mediaplayer.play();*/
                JavaFXApplication4.changeScreen(0);
                contador++;
                if(contador==videos){
                    contador = 0;
                }
                Media media = new Media("file:///C:/temp/video" + contador + ".mp4");
                mediaplayer = new MediaPlayer(media);
                mediaview.setMediaPlayer(mediaplayer);
                mediaplayer.play();
                changeVideo();
            }
        });
    }

}
