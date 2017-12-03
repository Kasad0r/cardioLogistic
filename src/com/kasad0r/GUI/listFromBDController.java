package com.kasad0r.GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import lombok.Getter;
import lombok.Setter;

import com.kasad0r.Entity.ECGCharacteristic;
import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
public class listFromBDController {
    private ObservableList<ECGCharacteristic> usersData = FXCollections.observableArrayList();
    @FXML
    private TableColumn<ECGCharacteristic, LocalDate> BirthDayTableColumn;

    @FXML
    private Button buttonSearch;

    @FXML
    private TextField WhatToSearchTextField;

    @FXML
    private TableColumn<ECGCharacteristic, String> FullnameTableColumn;

    @FXML
    private TableView<ECGCharacteristic> tableDb;

    @FXML
    private ChoiceBox<?> searchCharacteristic;

    @FXML
    private TableColumn<ECGCharacteristic, LocalDate> dateAnalisTableColumn;

    @FXML
    private void initialize() {
        searchCharacteristic =new ChoiceBox<>(FXCollections.observableArrayList("Фамилия", "Дата рождения","Дата Анализа"));
        System.out.println(searchCharacteristic.toString());
        initData();
        BirthDayTableColumn = new TableColumn<>("birthdayDate");
        dateAnalisTableColumn = new TableColumn<>("dateAnalysis");
        FullnameTableColumn.setCellValueFactory(new PropertyValueFactory<>("fullname"));
        tableDb.setItems(usersData);
    }

    private void initData() {
        Date date = new Date(19991021);
        usersData.add(new ECGCharacteristic("Dmitryy Pronyakin", date.toLocalDate(), date.toLocalDate()));
    }



    public void pressedElementBdFromTable(MouseEvent mouseEvent) {
        System.out.println(mouseEvent.getSource().toString());
    }
}
