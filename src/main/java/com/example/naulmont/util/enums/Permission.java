package com.example.naulmont.util.enums;

public enum Permission {

    PERM_READ("doctor:read"),
    PERM_WRITE("doctor:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
