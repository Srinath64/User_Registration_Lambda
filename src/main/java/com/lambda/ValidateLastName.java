package com.lambda;

@FunctionalInterface
    public interface ValidateLastName {
    public boolean validateLastName(String lastName) throws UserRegistrationException;
}

