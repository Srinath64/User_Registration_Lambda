package com.lambda;

@FunctionalInterface
public interface ValidateMobileNumber {
    public boolean validateMobileNumber(String mobilenumber) throws UserRegistrationException;
}
