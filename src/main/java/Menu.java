import java.sql.SQLOutput;

public class Menu {

    int auswahl;
    ReservationService service;

    public Menu(){

    }

    public void showMenu(){
        System.out.println("**********************");
        System.out.println("Willkommen bei Useless-Reservator");
        System.out.println();
        System.out.println("1. Reservierung erstellen");
        System.out.println("2. Reservierungen anzeigen");
        switch (auswahl){
            case 1:
        }
    }

    public void makeReservation(){
        System.out.println();
        System.out.println("***************************");
        System.out.println();
        System.out.println("Geben sie den Namen ein");

        System.out.println("Geben sie die Anzahl der Personen ein");

        System.out.println("Geben sie die Tischnummer ein");

        System.out.println("Geben sie das Reservierungsdatum ein");

        System.out.println("Geben sie die Reservierungszeit ein");


    }

    public void showReservations(){
        service.getReservation();
    }

}
