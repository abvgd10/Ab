package com.company;

import java.time.LocalDate;

public class Students {
    private String name;
    private LocalDate denroj;
    private String pochta;

    public Students(String name, LocalDate denroj, String pochta) {
        this.name = name;
        this.denroj = denroj;
        this.pochta = pochta;
    }
    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDenroj() {
        return denroj;
    }

    public void setDenroj(LocalDate denroj) {
        this.denroj = denroj;
    }

    public String getPochta() {
        return pochta;
    }

    public void setPochta(String pochta) {
        this.pochta = pochta;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", denroj=" + denroj +
                ", pochta='" + pochta + '\'' +
                '}';
    }
}
