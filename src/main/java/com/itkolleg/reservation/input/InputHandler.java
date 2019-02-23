package com.itkolleg.reservation.input;

import java.util.Scanner;

public class InputHandler implements Input {

    private Scanner scanner;
    private Validation validator;

    public InputHandler() {
        scanner = new Scanner(System.in);
        validator = new Validation();
    }

    @Override
    public String getString(ValidationType type) {
        String input = scanner.nextLine();

        switch (type) {
            case NAME:
                while (!validator.validateName(input)) {
                    input = scanner.nextLine();
                }
                break;
            case DATE:
                while (!validator.validateDate(input)) {
                    input = scanner.nextLine();
                }
            default:
                return null;
        }
        return input;
    }

    @Override
    public Double getDouble(ValidationType type) {
        String input = scanner.nextLine();

        switch (type) {
            case TIME:
                while (!validator.validateTime(input)) {
                    input = scanner.nextLine();
                }
                break;
            default:
                return null;
        }
        return Double.valueOf(input);
    }

    @Override
    public Integer getInt(ValidationType type) {
        String input = scanner.nextLine();

        switch (type) {
            case TABLENUMBER:
                while (!validator.validateTablenumber(input)) {
                    input = scanner.nextLine();
                }
                break;
            case PERSONS:
                while (!validator.validatePersons(input)) {
                    input = scanner.nextLine();
                }
                break;
            case SELECTION:
                while (!validator.validateSelection(input)) {
                    input = scanner.nextLine();
                }
                break;
            default:
                return null;
        }
        return Integer.valueOf(input);
    }
}
