package com.gamma1772.libmansys.util.auth;

public interface Account {
    boolean changePassword(String oldPassword, String newPassword) throws IllegalArgumentException;
    boolean changeUsername(String password, String username) throws IllegalArgumentException;
    AccountType getAccountType();
}
