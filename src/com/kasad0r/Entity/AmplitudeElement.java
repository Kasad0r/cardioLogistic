package com.kasad0r.Entity;

import javafx.scene.control.TextField;
import lombok.*;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "amplitudeelement", schema = "doctor_guides")
public class AmplitudeElement {
    private int id;
    private Double I;
    private Double II;
    private Double III;
    private Double AVR;
    private Double AVL;
    private Double AVF;
    private Double V1;
    private Double V2;
    private Double V3;
    private Double V4;
    private Double V5;
    private Double V6;
    private ECGCharacteristic ecgCharacteristic;

    public AmplitudeElement(TextField i, TextField II, TextField III, TextField AVR, TextField AVL, TextField AVF,
                            TextField v1, TextField v2, TextField v3, TextField v4, TextField v5, TextField v6) {
        try {
            I = Double.valueOf(i.getText());
            this.II = Double.valueOf(II.getText());
            this.III = Double.valueOf(III.getText());
            this.AVR = Double.valueOf(AVR.getText());
            this.AVL = Double.valueOf(AVL.getText());
            this.AVF = Double.valueOf(AVF.getText());
            V1 = Double.valueOf(v1.getText());
            V2 = Double.valueOf(v2.getText());
            V3 = Double.valueOf(v3.getText());
            V4 = Double.valueOf(v4.getText());
            V5 = Double.valueOf(v5.getText());
            V6 = Double.valueOf(v6.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Column(name = "I")
    public Double getI() {
        return I;
    }

    public void setI(Double i) {
        I = i;
    }

    @Column(name = "II")
    public Double getII() {
        return II;
    }

    public void setII(Double II) {
        this.II = II;
    }

    @Column(name = "III")
    public Double getIII() {
        return III;
    }

    public void setIII(Double III) {
        this.III = III;
    }

    @Column(name = "AVR")
    public Double getAVR() {
        return AVR;
    }

    public void setAVR(Double AVR) {
        this.AVR = AVR;
    }

    @Column(name = "AVL")
    public Double getAVL() {
        return AVL;
    }

    public void setAVL(Double AVL) {
        this.AVL = AVL;
    }

    @Column(name = "AVF")
    public Double getAVF() {
        return AVF;
    }

    public void setAVF(Double AVF) {
        this.AVF = AVF;
    }

    @Column(name = "V1")
    public Double getV1() {
        return V1;
    }

    public void setV1(Double v1) {
        V1 = v1;
    }

    @Column(name = "V2")
    public Double getV2() {
        return V2;
    }

    public void setV2(Double v2) {
        V2 = v2;
    }

    @Column(name = "V3")
    public Double getV3() {
        return V3;
    }

    public void setV3(Double v3) {
        V3 = v3;
    }

    @Column(name = "V4")
    public Double getV4() {
        return V4;
    }

    public void setV4(Double v4) {
        V4 = v4;
    }

    @Column(name = "V5")
    public Double getV5() {
        return V5;
    }

    public void setV5(Double v5) {
        V5 = v5;
    }

    @Column(name = "V6")
    public Double getV6() {
        return V6;
    }

    public void setV6(Double v6) {
        V6 = v6;
    }

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "id_seq", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    public ECGCharacteristic getEcgCharacteristic() {
        return ecgCharacteristic;
    }

    public void setEcgCharacteristic(ECGCharacteristic ecgCharacteristic) {
        this.ecgCharacteristic = ecgCharacteristic;
    }
}
