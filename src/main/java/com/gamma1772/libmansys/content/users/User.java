package com.gamma1772.libmansys.content.users;

import com.gamma1772.libmansys.util.auth.AccountType;
import com.gamma1772.libmansys.util.auth.ConsumerAccount;

public non-sealed class User extends AbstractPerson implements ConsumerAccount {

    @Override
    public boolean changePassword(String oldPassword, String newPassword) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean changeUsername(String password, String username) throws IllegalArgumentException {
        return false;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.USER;
    }
}
