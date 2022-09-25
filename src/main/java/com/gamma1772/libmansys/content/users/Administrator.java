package com.gamma1772.libmansys.content.users;

import com.gamma1772.libmansys.util.auth.AccountType;
import com.gamma1772.libmansys.util.auth.PrivilegedAccount;

public final class Administrator extends AbstractPerson implements PrivilegedAccount {

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
        return AccountType.ADMINISTRATOR;
    }
}
