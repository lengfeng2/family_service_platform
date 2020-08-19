package com.szb.result;

import java.util.List;

public class Permissions {
    private List<Permission> permissionList;

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "permissionList=" + permissionList +
                '}';
    }
}
