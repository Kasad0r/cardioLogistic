package com.kasad0r.GUI;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElementFromBdList {

    @FXML
    private TextField RR;

    @FXML
    private TextField PQ;

    @FXML
    private DatePicker BirthdayDate;

    @FXML
    private TextField QT;

    @FXML
    private ChoiceBox<?> genderChoiceBox;

    @FXML
    private TextField systematicIndicator;

    @FXML
    private TextField P;

    @FXML
    private TextField angleDeviationEOS;

    @FXML
    private TextField QRS;

    @FXML
    private TextField heartRate;

    @FXML
    private TextField growthField;

    @FXML
    private DatePicker dateAnalysis;

    @FXML
    private TextField FullName;

    @FXML
    private TextField weightField;

    @FXML
    private TextField intervalRR;

}

