package com.Exception;

import java.util.regex.Pattern;

/**
 * Matching the pattern with regular expression(regEx)
 */
public class UserRegistration {
    private String input;

    public UserRegistration(String input) {
        this.input = input;
    }

    
    UserRegistrationInterface firstNameValidate = fName -> {
        boolean result = Pattern.matches("^[A-Z][a-z]{2,}$", fName);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME, "Invalid first name");
    };

    
    UserRegistrationInterface lastNameValidate = lName -> {
        boolean result = Pattern.matches("^[A-Z][a-z]{2,}$", lName);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME, "Invalid last name");
    };

        UserRegistrationInterface phoneNumberValidate = phoneNumber -> {
            boolean result = Pattern.matches("^[0-9]{2}[\\s][0-9]{10}$", phoneNumber);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER, "Invalid phone number");
    };

    
    UserRegistrationInterface passwordValidate = password -> {
        boolean result = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$", password);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD, "Invalid password");
    };

    
    UserRegistrationInterface emailValidate = email -> {
        boolean result = Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL, "Invalid Email");
    };
}