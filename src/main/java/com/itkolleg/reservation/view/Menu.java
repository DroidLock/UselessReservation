package com.itkolleg.reservation.view;

import com.itkolleg.reservation.input.Input;
import com.itkolleg.reservation.input.InputHandler;
import com.itkolleg.reservation.input.ValidationType;
import com.itkolleg.reservation.service.Reservation;
import com.itkolleg.reservation.service.ReservationService;

public class Menu {

    private ReservationService service;
    private Input inputHandler;

    public Menu() {
        this.service = new ReservationService();
        this.inputHandler = new InputHandler();
    }

    public void showMenu() {
        System.out.println("**********************");
        System.out.println("Willkommen bei Useless-Reservator");
        System.out.println();
        System.out.println("1. Reservierung erstellen");
        System.out.println("2. Reservierungen anzeigen");
        System.out.println("9. Programm beenden");

        int a = inputHandler.getInt(ValidationType.SELECTION);

        switch (a) {
            case 1:
                makeReservation();
                break;
            case 2:
                showReservations();
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

    private void makeReservation() {
        System.out.println();
        System.out.println("***************************");
        System.out.println();
        System.out.println("Geben sie den Namen ein");
        String name = inputHandler.getString(ValidationType.NAME);
        System.out.println("Geben sie die Anzahl der Personen ein");
        int personen = inputHandler.getInt(ValidationType.PERSONS);
        System.out.println("Geben sie die Tischnummer ein");
        int tischnummer = inputHandler.getInt(ValidationType.TABLENUMBER);
        System.out.println("Geben sie das Reservierungsdatum ein");
        String datum = inputHandler.getString(ValidationType.DATE);
        System.out.println("Geben sie die Reservierungszeit ein");
        Double zeit = inputHandler.getDouble(ValidationType.TIME);
        service.addReservation(new Reservation(name, tischnummer, personen, datum, zeit));
    }

    private void showReservations() {
        for (Reservation a : service.getAllReservation()) {
            System.out.println(a);
        }
    }

}
