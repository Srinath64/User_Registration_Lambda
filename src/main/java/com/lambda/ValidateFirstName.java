package com.lambda;

@FunctionalInterface
public interface ValidateFirstName {
    public boolean validateFirstName(String firstName) throws UserRegistrationException;
}
