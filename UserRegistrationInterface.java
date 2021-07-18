package com.Exception;

/**
 * Functional interface for UserRegistration
 */
@FunctionalInterface
public interface UserRegistrationInterface<T> {
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}