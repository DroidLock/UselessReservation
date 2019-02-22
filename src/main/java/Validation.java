
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private boolean isCorrectName;
    private boolean isCorrectTablenumber;
    private boolean isCorrectPersons;
    private boolean isCorrectDate;
    private boolean isCorrectTime;
    private boolean isCorrectSelection;



    public boolean validateName(String name) {
        if(name.length() == 0) {
            isCorrectName = false;
            System.out.println("Bitte Namen eingeben");
        }
        else if(name.length() > 30) {
            isCorrectName = false;
            System.out.println("Name darf maximal 30 Zeichen haben!");
        }
        else {
            isCorrectName = true;
        }
        return isCorrectName;
    }

    public boolean validateTablenumber(String tablenumber) {
        isCorrectTablenumber = true;
        if(tablenumber.length() == 0) {
            isCorrectTablenumber = false;
            System.out.println("Bitte Tischnummer eingeben!");
        }
        else if(tablenumber.length() > 4) {
            isCorrectTablenumber = false;
            System.out.println("Tischnummer darf maximal 9999 sein!");
        }
        else {
            try {
                int castedTablenumber = Integer.valueOf(tablenumber);
            }
            catch(Exception e) {
                isCorrectTablenumber = false;
                System.out.println("Tischnummer ungueltig!");
            }
        }
        return isCorrectTablenumber;
    }

    public boolean validatePersons(String persons) {
        isCorrectPersons = true;
        if(persons.length() == 0) {
            isCorrectPersons = false;
            System.out.println("Bitte Personen Anzahl eingeben!");
        }
        else if(persons.length() > 4) {
            isCorrectPersons = false;
            System.out.println("Personen Anzahl darf maximal 9999 sein!");
        }
        else {
            try {
                int castedPersons = Integer.valueOf(persons);
            }
            catch(Exception e) {
                isCorrectPersons = false;
                System.out.println("Personen Anzahl ungueltig!");
            }
        }
        return isCorrectPersons;
    }

    public boolean validateDate(String date) {
        String patternDate = "[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}";

        if(date.length() == 0) {
            isCorrectDate = false;
            System.out.println("Bitte Datum eingeben!");
        }
        else {
            // Create a Pattern object
            Pattern r = Pattern.compile(patternDate);
            // Now create matcher object.
            Matcher m = r.matcher(date);

            if(m.find()) {
                isCorrectDate = true;
            }
            else {
                isCorrectDate = false;
                System.out.println("Datum ungueltig! (TT.MM.JJJJ)");
            }
        }

        return isCorrectDate;
    }

    public boolean validateTime(String time) {
        String patternTime = "[0-9]{2}[.]{1}[0-9]{2}";

        if(time.length() == 0) {
            isCorrectTime = false;
            System.out.println("Bitte Zeit eingeben");
        }
        else {
            // Create a Pattern object
            Pattern r = Pattern.compile(patternTime);
            // Now create matcher object.
            Matcher m = r.matcher(time);

            if(m.find()) {
                isCorrectDate = true;
            }
            else {
                isCorrectDate = false;
                System.out.println("Zeit ungueltig! (HH.MM)");
            }
        }
        return isCorrectTime;
    }

    public boolean validateSelection(String selection) {
        if(selection.length() == 0) {
            isCorrectSelection = false;
            System.out.println("Bitte Auswahl eingeben!");
        }
        else if(selection != "1" || selection != "2") {
            isCorrectSelection = false;
            System.out.println("Auswahl ungueltig!");
        }
        else {
            isCorrectSelection = true;
        }
        return isCorrectSelection;
    }


}
