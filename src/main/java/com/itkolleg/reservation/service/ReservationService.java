package com.itkolleg.reservation.service;

import java.util.ArrayList;

public class ReservationService {

    private ArrayList<Reservation> reservationArrayList;


    public ReservationService() {
        this.reservationArrayList = new ArrayList<Reservation>();
        addDemo();
    }

    public ArrayList<Reservation> getAllReservation() {
        return this.reservationArrayList;
    }

    public void addReservation(Reservation reservation) {
        this.reservationArrayList.add(reservation);
    }

    private void addDemo() {
        Reservation res1 = new Reservation("Andreas", 5, 4, "15.5.2019", 12.00);
        this.reservationArrayList.add(res1);
    }
}
