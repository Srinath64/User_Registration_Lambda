package com.lambda;

@FunctionalInterface
public interface ValidatePassword {
    public boolean validatePassword(String password) throws UserRegistrationException;
}
