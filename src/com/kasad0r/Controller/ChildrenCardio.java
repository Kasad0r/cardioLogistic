package com.kasad0r.Controller;

import com.kasad0r.Entity.AmplitudeElement;
import com.kasad0r.Entity.ECGCharacteristic;
import com.kasad0r.Entity.ViolationsAndNorms.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ChildrenCardio {

    static List<Object> childrenDiagnosis = new ArrayList<>();

    public ChildrenCardio(ECGCharacteristic ecgCharacteristic) {

    }

    public ChildrenCardio(AmplitudeElement amplitudeElement[]) {

    }

    public ChildrenCardio(ECGCharacteristic ecgCharacteristic, AmplitudeElement amplitudeElement[]) {

    }

    void transcriptECG(ECGCharacteristic ecgCharacteristic) {
        Period period = Period.between(ecgCharacteristic.getBirthdayDate(), LocalDate.now());
        int age = period.getYears();
        //ЧСС: новорожденные — 140 — 160, к 1 году — 120 — 125,
        //к 3 годам — 105 -110, к 10 годам — 80 — 85, после 12 лет — 70 — 75 в мин;
        checkHeartRate(ecgCharacteristic, age);
    }

    void checkHeartRate(ECGCharacteristic ecgCharacteristic, int age) {
        if (age < 1 && age >= 0) {
            if (ecgCharacteristic.getHeartRate() >= 140 && ecgCharacteristic.getHeartRate() <= 160) {
                childrenDiagnosis.add(HeartRate.Normal);
            } else if (ecgCharacteristic.getHeartRate() < 140) {
                childrenDiagnosis.add(HeartRate.SlowedDown);
            } else if (ecgCharacteristic.getHeartRate() > 160) {
                childrenDiagnosis.add(HeartRate.CardioPalmus);
            }
        } else if (age == 1) {
            if (ecgCharacteristic.getHeartRate() >= 120 && ecgCharacteristic.getHeartRate() <= 125) {
                childrenDiagnosis.add(HeartRate.Normal);
            } else if (ecgCharacteristic.getHeartRate() < 120) {
                childrenDiagnosis.add(HeartRate.SlowedDown);
            } else if (ecgCharacteristic.getHeartRate() > 125) {
                childrenDiagnosis.add(HeartRate.CardioPalmus);
            }
        } else if (age > 1 && age < 3) {
            if (ecgCharacteristic.getHeartRate() >= 105 && ecgCharacteristic.getHeartRate() <= 110) {
                childrenDiagnosis.add(HeartRate.Normal);
            } else if (ecgCharacteristic.getHeartRate() < 105) {
                childrenDiagnosis.add(HeartRate.SlowedDown);
            } else if (ecgCharacteristic.getHeartRate() > 110) {
                childrenDiagnosis.add(HeartRate.CardioPalmus);
            }
        } else if (age > 3 && age <= 11) {
            if (ecgCharacteristic.getHeartRate() >= 80 && ecgCharacteristic.getHeartRate() <= 85) {
                childrenDiagnosis.add(HeartRate.Normal);
            } else if (ecgCharacteristic.getHeartRate() < 80) {
                childrenDiagnosis.add(HeartRate.SlowedDown);
            } else if (ecgCharacteristic.getHeartRate() > 85) {
                childrenDiagnosis.add(HeartRate.CardioPalmus);
            }
        } else if (age > 12) {
            if (ecgCharacteristic.getHeartRate() >= 60 && ecgCharacteristic.getHeartRate() <= 90) {
                childrenDiagnosis.add(HeartRate.Normal);
            } else if (ecgCharacteristic.getHeartRate() < 60) {
                childrenDiagnosis.add(HeartRate.SlowedDown);
            } else if (ecgCharacteristic.getHeartRate() > 90) {
                childrenDiagnosis.add(HeartRate.CardioPalmus);
            }
        }
    }

    void checkP(ECGCharacteristic ecgCharacteristic) {
        if (ecgCharacteristic.getP() < 0.1) {
            childrenDiagnosis.add(P.Norma);
        } else if (ecgCharacteristic.getP() >= 0.1) {
            childrenDiagnosis.add(P.Exceeds);
        }
    }

    void checkPQ(ECGCharacteristic ecgCharacteristic) {
        if (ecgCharacteristic.getPQ() <= 0.2) {
            childrenDiagnosis.add(PQ.Norma);
        } else if (ecgCharacteristic.getPQ() > 0.2) {
            childrenDiagnosis.add(PQ.Exceeds);
        }
    }

    void checkQT(ECGCharacteristic ecgCharacteristic) {
        if (ecgCharacteristic.getQT() <= 0.41) {
            childrenDiagnosis.add(QT.Norma);
        } else if (ecgCharacteristic.getQT() > 0.41) {
            childrenDiagnosis.add(QT.Exceeds);
        }
    }

    void checkQRS(ECGCharacteristic ecgCharacteristic) {
        if (ecgCharacteristic.getQRS() >= 0.06 && ecgCharacteristic.getQRS() <= 0.1) {
            childrenDiagnosis.add(QRS.Norma);
        } else childrenDiagnosis.add(QRS.Exceeds);
    }
}
