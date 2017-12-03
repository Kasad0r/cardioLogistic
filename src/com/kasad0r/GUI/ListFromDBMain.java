package com.kasad0r.GUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ListFromDBMain {
    public ListFromDBMain() throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("listFromDB.fxml"));
        AnchorPane load = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Список с БД");
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }
}
