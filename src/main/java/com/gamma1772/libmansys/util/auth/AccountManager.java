package com.gamma1772.libmansys.util.auth;

public class AccountManager {
    private static AccountManager INSTANCE;

    static {
        try {
            INSTANCE = new AccountManager();
        }
        catch (RuntimeException exception) {
            System.err.println("Error creating account manager instance:");
            exception.printStackTrace(System.err);
        }
    }
    private AccountManager() {

    }

    public synchronized AccountManager getInstance() {
        return INSTANCE;
    }
}
