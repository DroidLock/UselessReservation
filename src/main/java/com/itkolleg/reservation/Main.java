package com.itkolleg.reservation;

import com.itkolleg.reservation.view.Menu;

public class Main {
    private static boolean running = true;

    public static void main(String[] args) {
        Menu menu = new Menu();

        while(running) {
            menu.showMenu();
        }
    }

    public static void exit() {
        running = false;
        System.out.println("Danke fürs Benützen der App");
    }
}
