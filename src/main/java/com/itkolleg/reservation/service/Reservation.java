package com.itkolleg.reservation.service;

public class Reservation {

    String name;
    int tischNummer;
    int personen;
    String datum;
    double uhrzeit;

    public Reservation(String name, int tischNummer, int personen, String datum, double uhrzeit) {
        this.name = name;
        this.tischNummer = tischNummer;
        this.personen = personen;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTischNummer() {
        return tischNummer;
    }

    public void setTischNummer(int tischNummer) {
        this.tischNummer = tischNummer;
    }

    public int getPersonen() {
        return personen;
    }

    public void setPersonen(int personen) {
        this.personen = personen;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public double getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(double uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "name='" + name + '\'' +
                ", tischNummer=" + tischNummer +
                ", personen=" + personen +
                ", datum='" + datum + '\'' +
                ", uhrzeit=" + uhrzeit +
                '}';
    }
}
