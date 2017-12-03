package com.kasad0r.GUI;

import com.kasad0r.Entity.AmplitudeElement;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import lombok.Getter;
import lombok.Setter;

import com.kasad0r.Entity.ECGCharacteristic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class generalMenuController implements Serializable {

    @FXML
    MenuItem MenuItemListFromDB;
    @FXML
    private TextField V5_Pminus;

    @FXML
    private TextField PQ;

    @FXML
    private TextField V2_Tplus;

    @FXML
    private TextField V3_Q;

    @FXML
    private TextField III_Tplus;

    @FXML
    private TextField AVL_Pminus;

    @FXML
    private TextField AVR_Pminus;

    @FXML
    private TextField AVF_Tplus;

    @FXML
    private TextField systematicIndicator;

    @FXML
    private TextField V3_S;

    @FXML
    private TextField V3_R;

    @FXML
    private TextField QT;

    @FXML
    private TextField AVL_ST;

    @FXML
    private TextField V1_Pplus;

    @FXML
    private TextField V4_Pplus;

    @FXML
    private TextField AVL_Tplus;

    @FXML
    private TextField II_Tminus;

    @FXML
    private TextField I_Pplus;

    @FXML
    private TextField AVR_R1;

    @FXML
    private MenuItem addToDataBase;

    @FXML
    private MenuItem clearTable;

    @FXML
    private TextField angleDeviationEOS;

    @FXML
    private TextField V2_ST;

    @FXML
    private TextField AVF_Pminus;

    @FXML
    private TextField I_ST;

    @FXML
    private TextField III_Pminus;

    @FXML
    private TextField V2_Pminus;

    @FXML
    private TextField V4_Pminus;

    @FXML
    private TextField V6_Pminus;

    @FXML
    private TextField RR;

    @FXML
    private TextField V2_R;

    @FXML
    private TextField V2_Q;

    @FXML
    private TextField III_Pplus;

    @FXML
    private TextField III_R1;

    @FXML
    private TextField V5_Pplus;

    @FXML
    private TextField P;

    @FXML
    private TextField AVL_Tminus;

    @FXML
    private TextField QRS;

    @FXML
    private TextField V6_S;

    @FXML
    private TextField V6_R;

    @FXML
    private TextField V4_Tplus;

    @FXML
    private TextField V6_Q;

    @FXML
    private TextField V1_ST;

    @FXML
    private TextField V2_S;

    @FXML
    private TextField AVR_Tplus;

    @FXML
    private TextField intervalRR;

    @FXML
    private TextField AVF__Pplus;

    @FXML
    private TextField V6_Pplus;

    @FXML
    private TextField AVF_ST;

    @FXML
    private TextField V5_R1;

    @FXML
    private TextField AVL_R1;

    @FXML
    private TextField V6_Tminus;

    @FXML
    private TextField V2_Tminus;

    @FXML
    private TextField V5_Tplus;

    @FXML
    private TextField AVL_Pplus;

    @FXML
    private TextField AVL_Q;

    @FXML
    private TextField V4_ST;

    @FXML
    private TextField AVL_R;

    @FXML
    private TextField V2_R1;

    @FXML
    private TextField AVL_S;

    @FXML
    private TextField I_Tminus;

    @FXML
    private TextField V1_Pminus;

    @FXML
    private Button buttonResault;

    @FXML
    private TextField V1_S;

    @FXML
    private TextField V1_R;

    @FXML
    private TextField V1_Q;

    @FXML
    private TextField I_Pminus;

    @FXML
    private TextField III_ST;

    @FXML
    private MenuBar menuBar;

    @FXML
    private TextField V1_R1;

    @FXML
    private TextField AVR_Pplus;

    @FXML
    private TextField V5_S;

    @FXML
    private TextField V5_R;

    @FXML
    private TextField V5_Q;

    @FXML
    private TextField V3_ST;

    @FXML
    private TextField III_S;

    @FXML
    private TextField III_R;

    @FXML
    private TextField III_Q;

    @FXML
    private TextField II_Pplus;

    @FXML
    private TextField AVF_R1;

    @FXML
    private TextField V5_Tminus;

    @FXML
    private TextField V6_Tplus;

    @FXML
    private TextField V3_Tminus;

    @FXML
    private TextField heartRate;

    @FXML
    private TextField V4_R1;

    @FXML
    private TextField V6_ST;

    @FXML
    private DatePicker dateAnalysis;

    @FXML
    private TextField II_R1;

    @FXML
    private TextField V3_Tplus;

    @FXML
    private TextField II_Pminus;

    @FXML
    private TextField II_Tplus;

    @FXML
    private TextField II_ST;

    @FXML
    private TextField AVF_Tminus;

    @FXML
    private TextField V6_R1;

    @FXML
    private TextField V1_Tminus;

    @FXML
    private TextField II_Q;

    @FXML
    private TextField II_R;

    @FXML
    private TextField III_Tminus;

    @FXML
    private TextField V2_Pplus;

    @FXML
    private TextField V5_ST;

    @FXML
    private TextField V4_S;

    @FXML
    private TextField V3_R1;

    @FXML
    private TextField V4_R;

    @FXML
    private TextField II_S;

    @FXML
    private TextField V4_Q;

    @FXML
    private Button ButtonAddToDB;

    @FXML
    private TextField I_Q;

    @FXML
    private TextField I_S;

    @FXML
    private TextField I_R;

    @FXML
    private DatePicker BirthdayDate;

    @FXML
    private TextField AVR_Tminus;

    @FXML
    private TextField AVR_R;

    @FXML
    private TextField V1_Tplus;

    @FXML
    private TextField AVR_S;

    @FXML
    private TextField AVR_ST;

    @FXML
    private TextField I_Tplus;

    @FXML
    private TextField V4_Tminus;

    @FXML
    private TextField V3_Pplus;

    @FXML
    private TextField AVR_Q;

    @FXML
    private TextField FullName;

    @FXML
    private TextField I_R1;

    @FXML
    private TextField AVF_R;

    @FXML
    private TextField AVF_S;

    @FXML
    private TextField V3_Pminus;

    @FXML
    private TextField AVF_Q;

    @FXML
    private ChoiceBox<?> genderChoiceBox;

    @FXML
    private TextField growthField;

    @FXML
    private TextField weightField;

    {
        genderChoiceBox = new ChoiceBox<>(FXCollections.observableArrayList("М", "Ж"));
        genderChoiceBox.show();
    }

    public AmplitudeElement getAmplitudePPlusElement() {
        return new AmplitudeElement(I_Pplus, II_Pplus, III_Pplus, AVR_Pplus, AVL_Pplus,
                AVF__Pplus, V1_Pplus, V2_Pplus
                , V3_Pplus, V4_Pplus, V5_Pplus, V6_Pplus);
    }

    public AmplitudeElement getAmplitudePMinusElement() {
        return new AmplitudeElement(I_Pminus, II_Pminus, III_Pminus, AVR_Pminus, AVL_Pminus,
                AVF_Pminus, V1_Pminus, V2_Pminus
                , V3_Pminus, V4_Pminus, V5_Pminus, V6_Pminus);
    }

    public AmplitudeElement getAmplitudeQElement() {
        return new AmplitudeElement(I_Q, II_Q, III_Q, AVR_Q, AVL_Q,
                AVF_Q, V1_Q, V2_Q
                , V3_Q, V4_Q, V5_Q, V6_Q);
    }

    public AmplitudeElement getamplitudeRElement() {
        return new AmplitudeElement(I_R, II_R, III_R, AVR_R, AVL_R,
                AVF_R, V1_R, V2_R
                , V3_R, V4_R, V5_R, V6_R);
    }

    public AmplitudeElement getAmplitudeR1Element() {
        return new AmplitudeElement(I_R1, II_R1, III_R1, AVR_R1, AVL_R1,
                AVF_R1, V1_R1, V2_R1
                , V3_R1, V4_R1, V5_R1, V6_R1);
    }

    public AmplitudeElement getAmplitudeSElement() {
        return new AmplitudeElement(I_S, II_S, III_S, AVR_S, AVL_S,
                AVF_S, V1_S, V2_S
                , V3_S, V4_S, V5_S, V6_S);
    }

    public AmplitudeElement getAmplitudeTPlusElement() {
        return new AmplitudeElement(I_Tplus, II_Tplus, III_Tplus, AVR_Tplus, AVL_Tplus,
                AVF_Tplus, V1_Tplus, V2_Tplus
                , V3_Tplus, V4_Tplus, V5_Tplus, V6_Tplus);
    }

    public AmplitudeElement getAmplitudeTMinusElement() {
        return new AmplitudeElement(I_Tminus, II_Tminus, III_Tminus, AVR_Tminus, AVL_Tminus,
                AVF_Tminus, V1_Tminus, V2_Tminus
                , V3_Tminus, V4_Tminus, V5_Tminus, V6_Tminus);
    }

    public AmplitudeElement getAmplitudeSTElement() {
        return new AmplitudeElement(I_ST, II_ST, III_ST, AVR_ST, AVL_ST,
                AVF_ST, V1_ST, V2_ST
                , V3_ST, V4_ST, V5_ST, V6_ST);
    }

    public List<AmplitudeElement> getAmplitudeElementList() {
        List<AmplitudeElement> list = new ArrayList<AmplitudeElement>();
        list.add(getAmplitudePPlusElement());
        list.add(getAmplitudePMinusElement());
        list.add(getAmplitudeQElement());
        list.add(getamplitudeRElement());
        list.add(getAmplitudeR1Element());
        list.add(getAmplitudeSElement());
        list.add(getAmplitudeTPlusElement());
        list.add(getAmplitudeTMinusElement());
        list.add(getAmplitudeSTElement());
        return list;
    }

    public ECGCharacteristic getEcgCharacteristic() {
        return new ECGCharacteristic(FullName, dateAnalysis, growthField, weightField, genderChoiceBox, BirthdayDate, angleDeviationEOS, intervalRR,
                RR, PQ, QT, P, QRS, heartRate, systematicIndicator);
    }

    @FXML
    public void pressedButton(ActionEvent event) {
        if (event.getSource().equals(buttonResault)) {
            System.out.println(getEcgCharacteristic().toString());
        }
    }

    @FXML
    public void goToListFromDB(ActionEvent e) {
        try {
            new ListFromDBMain();
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

    @FXML
    public void exit(ActionEvent e) {
        try {
            Platform.exit();
        } catch (Exception e1) {
        }
    }
}
