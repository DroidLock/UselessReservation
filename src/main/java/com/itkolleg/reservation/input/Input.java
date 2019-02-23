package com.itkolleg.reservation.input;

public interface Input {
    String getString(ValidationType type);

    Double getDouble(ValidationType type);

    Integer getInt(ValidationType type);
}
