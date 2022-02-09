package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Gruppa {
    private String[] students;
    private String shtou;
    private LocalDate kachanokupbashtagan;

    public Gruppa(String[] students, String shtou, LocalDate kachanokupbashtagan) {
        this.students = students;
        this.shtou = shtou;
        this.kachanokupbashtagan = kachanokupbashtagan;
    }
    public Gruppa() {
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String getShtou() {
        return shtou;
    }

    public void setShtou(String shtou) {
        this.shtou = shtou;
    }

    public LocalDate getKachanokupbashtagan() {
        return kachanokupbashtagan;
    }

    public void setKachanokupbashtagan(LocalDate kachanokupbashtagan) {
        this.kachanokupbashtagan = kachanokupbashtagan;
    }

    @Override
    public String toString() {
        return "Gruppa{" +
                "students=" + Arrays.toString(students) +
                ", shtou='" + shtou + '\'' +
                ", kachanokupbashtagan=" + kachanokupbashtagan +
                '}';
    }
}
