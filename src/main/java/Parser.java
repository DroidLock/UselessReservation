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

        if (tag.equals("name")) {
            while (!validator.validateName(input)) {
                input = scanner.nextLine();
            }
        } else if (tag.equals("date")) {
            while (!validator.validateDate(input)) {
                input = scanner.nextLine();
            }
        }
        return input;
    }

    public double getDouble(String tag) {
        String input = scanner.nextLine();

        if (tag.equals("time")) {
            while (!validator.validateTime(input)) {
                input = scanner.nextLine();
            }
        }
        return Double.valueOf(input);
    }

    public int getInt(String tag) {
        String input = scanner.nextLine();

        if (tag.equals("tableNumber")) {
            while (!validator.validateTablenumber(input)) {
                input = scanner.nextLine();
            }
        } else if (tag.equals("people")) {
            while (!validator.validatePersons(input)) {
                input = scanner.nextLine();
            }
        } else if (tag.equals("selection")) {
            while (!validator.validateSelection(input)) {
                input = scanner.nextLine();
            }
        }
        return Integer.valueOf(input);
    }
}
