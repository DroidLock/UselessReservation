package com.itkolleg.reservation.view;

import com.itkolleg.reservation.input.Parser;
import com.itkolleg.reservation.service.Reservation;
import com.itkolleg.reservation.service.ReservationService;

public class Menu {

    private ReservationService service;
    private Parser parser;

    public Menu() {
        this.service = new ReservationService();
        this.parser = new Parser();
    }

    public void showMenu() {
        System.out.println("**********************");
        System.out.println("Willkommen bei Useless-Reservator");
        System.out.println();
        System.out.println("1. Reservierung erstellen");
        System.out.println("2. Reservierungen anzeigen");
        System.out.println("9. Programm beenden");

        int a = parser.getInt("selection");

        switch (a){
            case 1: makeReservation();
            break;
            case 2: showReservations();
            break;
            case 9:
                System.out.println("Danke fürs benützen der App");
                System.exit(0);
            break;
            default:
            System.out.println("something went wrong");
            showMenu();
        }
    }

    public void makeReservation() {
        System.out.println();
        System.out.println("***************************");
        System.out.println();
        System.out.println("Geben sie den Namen ein");
        String name = parser.getString("name");
        System.out.println("Geben sie die Anzahl der Personen ein");
        int personen = parser.getInt("people");
        System.out.println("Geben sie die Tischnummer ein");
        int tischnummer = parser.getInt("tableNumber");
        System.out.println("Geben sie das Reservierungsdatum ein");
        String datum = parser.getString("date");
        System.out.println("Geben sie die Reservierungszeit ein");
        Double zeit = parser.getDouble("time");
        service.addReservation(new Reservation(name, tischnummer, personen, datum, zeit));
        showMenu();
    }

    public void showReservations() {
        for (Reservation a: service.getAllReservation()
             ) {
            System.out.println(a);
        }
showMenu();
    }

}
