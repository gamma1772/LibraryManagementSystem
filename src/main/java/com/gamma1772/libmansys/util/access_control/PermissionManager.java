package com.gamma1772.libmansys.util.access_control;

public class PermissionManager {

    private static PermissionManager INSTANCE;

    static {
        try {
            INSTANCE = new PermissionManager();
        }
        catch (RuntimeException exception) {
            System.err.println("Error creating permission manager instance:");
            exception.printStackTrace(System.err);
        }
    }
    private PermissionManager() {

    }

    public synchronized PermissionManager getInstance() {
        return INSTANCE;
    }
}
