package com.google.www.exceptions;

import org.openqa.selenium.ElementNotVisibleException;

public class AddProductException extends ElementNotVisibleException {

    public static final String ELEMENT_NO_VISIBLE_FAILED_MESSAGE = "The element has not been found";

    public AddProductException(String message, Throwable cause) {
        super(message, cause);
    }
}
