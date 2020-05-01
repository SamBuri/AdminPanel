package com.saburi.adminpanel.main;

import com.saburi.common.utils.CommonNavigate;
import com.saburi.common.utils.FXUIUtils;
import com.saburi.common.utils.Navigation;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Navigation.parentScene = MainApp.class;
            Navigation.parentFXMl = "Scene";
            Navigation.persistenceUnit = "com.saburi.mysql.AdminPanel";
            Navigation.appTitle = "Admin Panel";
             Navigation.image = Navigation.getImage(getClass());
            stage.getIcons().add(Navigation.image);
            Scene scene = new Scene(CommonNavigate.loadFXML("LoginEdit"));
            scene.getStylesheets().add(Navigation.styleControls);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(e -> System.exit(0));
        } catch (IOException e) {
            FXUIUtils.errorMessage(e);
        } catch (Exception e) {
            FXUIUtils.errorMessage(e);
        }
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
