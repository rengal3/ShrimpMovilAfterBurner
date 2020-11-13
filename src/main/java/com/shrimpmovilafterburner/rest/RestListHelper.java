package com.shrimpmovilafterburner.rest;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.gluonhq.connect.GluonObservableList;
import com.gluonhq.connect.converter.InputStreamIterableInputConverter;
import com.gluonhq.connect.provider.DataProvider;
import com.gluonhq.connect.provider.RestClient;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

public class RestListHelper extends View {

    public RestListHelper() {

        // create a RestClient to the specific URL
        RestClient restClient = RestClient.create()
                .method("POST")
                .host("http://test.acosux.com")
                .path("/Pruebas/todocompuWS/appWebController/validarPermisos");
        
        
        // create a custom Converter that is able to parse the response into a list of objects
        InputStreamIterableInputConverter<Error> converter = new ItemsIterableInputConverter<>(Error.class);

        // retrieve a list from the DataProvider
        GluonObservableList<Error> errors = DataProvider.retrieveList(restClient.createListDataReader(converter));
        
        // create a JavaFX ListView and populate it with the retrieved list
        ListView<Error> lvErrors = new ListView<>(errors);
        /*
        lvErrors.setCellFactory(lv -> new ListCell<Error>() {
            @Override
            protected void updateItem(Error item, boolean empty) {
                super.updateItem(item, empty);

                if (!empty) {
                    setText(item.getErrorId() + " - " + item.getErrorName());
                } else {
                    setText(null);
                }
            }
        });
        */
        setCenter(lvErrors);
    }

    @Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> getApplication().getDrawer().open()));
        appBar.setTitleText("Rest List Viewer");
    }
}
