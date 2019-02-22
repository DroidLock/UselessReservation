package service;

import java.util.ArrayList;

public class ReservationService {

    ArrayList<Reservation> reservationArrayList;

    public ReservationService() {
        this.reservationArrayList = new ArrayList<Reservation>();
    }

    public ArrayList<Reservation> getAllReservation(){
        return this.reservationArrayList;
    }

    public void addReservation(Reservation reservation){
        this.reservationArrayList.add(reservation);
    }
}
