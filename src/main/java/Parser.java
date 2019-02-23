import java.util.Scanner;

public class Parser {

    private Scanner scanner;
    private Validation validator;

    public Parser() {
        scanner = new Scanner(System.in);
        validator = new Validation();
    }

    public String getString(String tag) {
        String input = scanner.nextLine();

        if (tag.equalsIgnoreCase("name")) {
            while (!validator.validateName(input)) {
                input = scanner.nextLine();
            }
        } else if (tag.equalsIgnoreCase("date")) {
            while (!validator.validateDate(input)) {
                input = scanner.nextLine();
            }
        } else {
            return null;
        }
        return input;
    }

    public Double getDouble(String tag) {
        String input = scanner.nextLine();

        if (tag.equalsIgnoreCase("time")) {
            while (!validator.validateTime(input)) {
                input = scanner.nextLine();
            }
        } else {
            return null;
        }
        return Double.valueOf(input);
    }

    public Integer getInt(String tag) {
        String input = scanner.nextLine();

        if (tag.equalsIgnoreCase("tablenumber")) {
            while (!validator.validateTablenumber(input)) {
                input = scanner.nextLine();
            }
        } else if (tag.equalsIgnoreCase("people")) {
            while (!validator.validatePersons(input)) {
                input = scanner.nextLine();
            }
        } else if (tag.equalsIgnoreCase("selection")) {
            while (!validator.validateSelection(input)) {
                input = scanner.nextLine();
            }
        } else {
            return null;
        }
        return Integer.valueOf(input);
    }
}
