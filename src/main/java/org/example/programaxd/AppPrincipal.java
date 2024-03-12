package org.example.programaxd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AppPrincipal extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppPrincipal.class.getResource("PagPrinc.fxml"));
        Image image = new Image("https://s.yimg.com/ny/api/res/1.2/RK3rMepKrZa9fxKGB1.ZJw--/YXBwaWQ9aGlnaGxhbmRlcjt3PTY0MA--/https://s.yimg.com/os/es-ES/News/article.nationalgeographic.com.es/5159.jpg");
        Scene scene = new Scene(fxmlLoader.load());
        stage.getIcons().add(image);
        stage.setTitle("Suficiente");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}