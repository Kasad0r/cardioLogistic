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
    private TableColumn<ECGCharacteristic, String> BirthDayTableColumn;

    @FXML
    private TextField WhatToSearchTextField;

    @FXML
    private TableColumn<ECGCharacteristic,String> FullnameTableColumn;

    @FXML
    private TableView<ECGCharacteristic> tableDb;

    @FXML
    private TableColumn<ECGCharacteristic, LocalDate> dateAnalisTableColumn;
    public listFromBDController(){
        Date date = new Date(19991021);
        usersData.add(new ECGCharacteristic("Dmitryy Pronyakin", date.toLocalDate(), date.toLocalDate()));
    }

    @FXML
    private void initialize() {
        initData();
        BirthDayTableColumn = new TableColumn<>("birthdayDate");
        dateAnalisTableColumn = new TableColumn<>("dateAnalysis");
        FullnameTableColumn.setCellValueFactory(new PropertyValueFactory<>("fullname"));
    }

    private void initData() {

    }



    public void pressedElementBdFromTable(MouseEvent mouseEvent) {
        System.out.println(mouseEvent.getSource().toString());
    }
}
