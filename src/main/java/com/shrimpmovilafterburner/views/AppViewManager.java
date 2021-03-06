package com.shrimpmovilafterburner.views;

import com.gluonhq.charm.glisten.afterburner.AppView;
import com.gluonhq.charm.glisten.afterburner.AppViewRegistry;
import com.gluonhq.charm.glisten.afterburner.GluonPresenter;
import com.gluonhq.charm.glisten.afterburner.Utils;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.Avatar;
import com.gluonhq.charm.glisten.control.NavigationDrawer;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.shrimpmovilafterburner.ShrimpMovilAfterBurner;
import javafx.scene.image.Image;
import java.util.Locale;

import static com.gluonhq.charm.glisten.afterburner.AppView.Flag.HOME_VIEW;
import static com.gluonhq.charm.glisten.afterburner.AppView.Flag.SHOW_IN_DRAWER;
import static com.gluonhq.charm.glisten.afterburner.AppView.Flag.SKIP_VIEW_STACK;

public class AppViewManager {

    public static final AppViewRegistry REGISTRY = new AppViewRegistry();

    //public static final AppView INICIO_VIEW = view("Inicio", InicioPresenter.class, MaterialDesignIcon.HOME, SHOW_IN_DRAWER, HOME_VIEW, SKIP_VIEW_STACK);
    public static final AppView LOGIN_VIEW = view("Login", LoginPresenter.class, MaterialDesignIcon.HOME, SKIP_VIEW_STACK, HOME_VIEW);
    public static final AppView INICIO_VIEW = view("Inicio", InicioPresenter.class, MaterialDesignIcon.HOME, SHOW_IN_DRAWER);
    public static final AppView OPCION1_VIEW = view("Opcion1", Opcion1Presenter.class, MaterialDesignIcon.DASHBOARD, SHOW_IN_DRAWER);
    public static final AppView INGRESAGRAMAJE_VIEW = view("Ingresar Gramaje", IngresarGramajePresenter.class, MaterialDesignIcon.MENU, SHOW_IN_DRAWER);
    public static final AppView CONSULTAGRAMAJE_VIEW = view("Consulta Gramaje", ConsultaEditaGramajePresenter.class, MaterialDesignIcon.ADD, SKIP_VIEW_STACK);
    
    private static AppView view(String title, Class<? extends GluonPresenter<?>> presenterClass, MaterialDesignIcon menuIcon, AppView.Flag... flags ) {
        return REGISTRY.createView(name(presenterClass), title, presenterClass, menuIcon, flags);
    }

    private static String name(Class<? extends GluonPresenter<?>> presenterClass) {
        return presenterClass.getSimpleName().toUpperCase(Locale.ROOT).replace("PRESENTER", "");
    }
    
    public static void registerViewsAndDrawer(MobileApplication app) {
        for (AppView view : REGISTRY.getViews()) {
            view.registerView(app);
        }

        NavigationDrawer.Header header = new NavigationDrawer.Header("Shrimp Movil",
                "Proyecto Movil de Muestra",
                new Avatar(21, new Image(ShrimpMovilAfterBurner.class.getResourceAsStream("/icon.png"))));

        Utils.buildDrawer(app.getDrawer(), header, REGISTRY.getViews()); 
    }
}
