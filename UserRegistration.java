package com.Usergistration;

import java.util.regex.Pattern;

/**
 * Regular expression for email validation
 */
public class UserRegistration {
    public boolean validateEmail(String email) {
        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
    }
}
