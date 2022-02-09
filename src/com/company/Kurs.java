package com.company;

import java.util.Arrays;

public class Kurs {
    private String name;
    private int namber;
    private String nameticher;
    private String[] grup;

    public Kurs(String name, int namber, String nameticher, String[] grup) {
        this.name = name;
        this.namber = namber;
        this.nameticher = nameticher;
        this.grup = grup;
    }
    public Kurs() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        this.namber = namber;
    }

    public String getNameticher() {
        return nameticher;
    }

    public void setNameticher(String nameticher) {
        this.nameticher = nameticher;
    }

    public String[] getGrup() {
        return grup;
    }

    public void setGrup(String[] grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "name='" + name + '\'' +
                ", namber=" + namber +
                ", nameticher='" + nameticher + '\'' +
                ", grup=" + Arrays.toString(grup) +
                '}';
    }
}
