package com.itkolleg.reservation.input;

/**
 * Interface that provides methods for user input. The input gets validated and returned to the caller.
 */
public interface Input {

    /**
     * Method that returns a String and validates it with the ValidationType supplied.
     * @param type The ValidationType to choose, how the input should get validated.
     * @return The validated String the user typed in.
     */
    String getString(ValidationType type);

    /**
     * Method that returns a Double and validates it with the ValidationType supplied.
     * @param type The ValidationType to choose, how the input should get validated.
     * @return The validated Double the user typed in.
     */
    Double getDouble(ValidationType type);

    /**
     * Method that returns an Integer and validates it with the ValidationType supplied.
     * @param type The ValidationType to choose, how the input should get validated.
     * @return The validated Integer the user typed in.
     */
    Integer getInt(ValidationType type);
}
