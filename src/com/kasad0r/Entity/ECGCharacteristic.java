package com.kasad0r.Entity;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Entity
@Table(name = "ECGCharacteristic")
public class ECGCharacteristic {
    @Column(name = "id")
    private long id;
    @Column(name = "fullname")
   private String fullName;
    @Column(name = "growth")
    private double growth;
    @Column(name = "weight")
    private double weight;
    @Column(name = "sex")
    private String sex;
    @Temporal(TemporalType.DATE)
    @Column(name = "dateAnalysis")
    private LocalDate dateAnalysis;
    @Temporal(TemporalType.DATE)
    @Column(name = "birthdayDate")
    private LocalDate birthdayDate;
    @Column(name = "angleDeviationEOS")
    private int angleDeviationEOS;      //Градусы
    @Column(name = "intervalRR")
    private int intervalRR;             //%
    @Column(name = "RR")
    private double RR;
    @Column(name = "PQ")
    private double PQ;
    @Column(name = "QT")
    private double QT;
    @Column(name = "P")
    private double P;
    @Column(name = "QRS")
    private double QRS;
    @Column(name = "heartRate")
    private int heartRate;
    @Column(name = "systematicIndicator")
    private int systematicIndicator;
    private AmplitudeElement[] amplitudeElements;

    public ECGCharacteristic(String fullName, LocalDate dateAnalysis, LocalDate birthdayDate) {
        this.fullName = fullName;
        this.dateAnalysis = dateAnalysis;
        this.birthdayDate = birthdayDate;
    }

    public ECGCharacteristic(TextField fullName, DatePicker dateAnalysis, TextField growth, TextField weight, ChoiceBox sex, DatePicker birthdayDate,
                             TextField angleDeviationEOS, TextField intervalRR, TextField RR, TextField PQ, TextField QT,
                             TextField p, TextField QRS, TextField heartRate, TextField systematicIndicator) {
        this.fullName = fullName.getText();
        this.growth = Double.valueOf(growth.toString());
        this.weight = Double.valueOf(weight.toString());
        this.sex = sex.toString();
        this.dateAnalysis = dateAnalysis.getValue();
        this.birthdayDate = birthdayDate.getValue();
        this.angleDeviationEOS = Integer.valueOf(angleDeviationEOS.getText());
        this.intervalRR = Integer.valueOf(intervalRR.getText());
        this.RR = Double.valueOf(RR.getText());
        this.PQ = Double.valueOf(PQ.getText());
        this.QT = Double.valueOf(QT.getText());
        this.P = Double.valueOf(p.getText());
        this.QRS = Double.valueOf(QRS.getText());
        this.heartRate = Integer.parseInt(heartRate.getText());
        this.systematicIndicator = Integer.parseInt(systematicIndicator.getText());
    }

    @Override
    public String toString() {
        return "ECGCharacteristic{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", growth=" + growth +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", dateAnalysis=" + dateAnalysis +
                ", birthdayDate=" + birthdayDate +
                ", angleDeviationEOS=" + angleDeviationEOS +
                ", intervalRR=" + intervalRR +
                ", RR=" + RR +
                ", PQ=" + PQ +
                ", QT=" + QT +
                ", P=" + P +
                ", QRS=" + QRS +
                ", heartRate=" + heartRate +
                ", systematicIndicator=" + systematicIndicator +
                '}';
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "growth", nullable = false, insertable = true, updatable = true)
    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "weight", nullable = false, insertable = true, updatable = true)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "sex", nullable = false, insertable = true, updatable = true)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_user_id_seq", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fullname", nullable = false, updatable = true, length = 60)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dateanalysis", nullable = false, insertable = true, updatable = true)
    public LocalDate getDateAnalysis() {
        return dateAnalysis;
    }

    public void setDateAnalysis(LocalDate dateAnalysis) {
        this.dateAnalysis = dateAnalysis;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "birthDayDate", nullable = false, insertable = true, updatable = true)
    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    @Basic
    @Column(name = "angleDeviationEOS", nullable = false, updatable = true, insertable = true)
    public int getAngleDeviationEOS() {
        return angleDeviationEOS;
    }

    public void setAngleDeviationEOS(int angleDeviationEOS) {
        this.angleDeviationEOS = angleDeviationEOS;
    }

    @Basic
    @Column(name = "intervalRR", updatable = true, insertable = true)
    public int getIntervalRR() {
        return intervalRR;
    }

    public void setIntervalRR(int intervalRR) {
        this.intervalRR = intervalRR;
    }

    @Basic
    @Column(name = "RR", updatable = true, insertable = true)
    public double getRR() {
        return RR;
    }

    public void setRR(double RR) {
        this.RR = RR;
    }

    @Basic
    @Column(name = "PQ", updatable = true, insertable = true)
    public double getPQ() {
        return PQ;
    }

    public void setPQ(double PQ) {
        this.PQ = PQ;
    }

    @Basic
    @Column(name = "QT", updatable = true, insertable = true)
    public double getQT() {
        return QT;
    }

    public void setQT(double QT) {
        this.QT = QT;
    }

    @Basic
    @Column(name = "P", updatable = true, insertable = true)
    public double getP() {
        return P;
    }

    public void setP(double p) {
        P = p;
    }

    @Basic
    @Column(name = "QRS", updatable = true, insertable = true)
    public double getQRS() {
        return QRS;
    }

    public void setQRS(double QRS) {
        this.QRS = QRS;
    }

    @Basic
    @Column(name = "heartRate", updatable = true, insertable = true)
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    @Basic
    @Column(name = "systematicIndicator", updatable = true, insertable = true)
    public int getSystematicIndicator() {
        return systematicIndicator;
    }

    public void setSystematicIndicator(int systematicIndicator) {
        this.systematicIndicator = systematicIndicator;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    public AmplitudeElement[] getAmplitudeElements() {
        return amplitudeElements;
    }

    public void setAmplitudeElements(AmplitudeElement[] amplitudeElements) {
        this.amplitudeElements = amplitudeElements;
    }
}
