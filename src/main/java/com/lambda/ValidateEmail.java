package com.lambda;

@FunctionalInterface
public interface ValidateEmail {
    public boolean validateEmail(String email) throws UserRegistrationException;
}