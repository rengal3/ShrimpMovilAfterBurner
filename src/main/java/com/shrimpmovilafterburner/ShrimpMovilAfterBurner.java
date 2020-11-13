package com.shrimpmovilafterburner;

import com.shrimpmovilafterburner.views.AppViewManager;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ShrimpMovilAfterBurner extends MobileApplication {

    @Override
    public void init() {
        AppViewManager.registerViewsAndDrawer(this);
    }

    @Override
    public void postInit(Scene scene) {
        Swatch.BLUE.assignTo(scene);

        scene.getStylesheets().add(ShrimpMovilAfterBurner.class.getResource("style.css").toExternalForm());
        ((Stage) scene.getWindow()).getIcons().add(new Image(ShrimpMovilAfterBurner.class.getResourceAsStream("/icon.png")));
    }

    
    public static void main(String args[]) {
        launch(args);
    }
}
