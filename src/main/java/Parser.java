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
      while (validator.validateName(input)) {
        return input;
      }
    } else if (tag.equals("date")) {
      while (validator.validateDate(input)) {
        return input;
      }
    }
    return "";
  }

  public double getDouble(String tag) {
    String input = scanner.nextLine();

    if (tag.equals("time")) {
      while (!validator.validateTime(input)) {
        return Double.valueOf(input);
      }
    }
    return -1.0;
  }

  public int getInt(String tag) {
    String input = scanner.nextLine();

    if (tag.equals("tableNumber")) {
      while (!validator.validateTablenumber(input)) {
        return Integer.valueOf(input);
      }
    } else if (tag.equals("people")) {
      while (validator.validatePersons(input)) {
        return Integer.valueOf(input);
      }
    } else if(tag.equals("selection")) {
      while(validator.validateSelection(input)) {
        return Integer.valueOf(input);
      }
    }
    return -1;
  }
}
