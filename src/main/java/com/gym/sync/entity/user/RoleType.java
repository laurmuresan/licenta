package com.gym.sync.entity.user;

/**
 * @author laurmuresan
 */
public enum RoleType {

    ADMIN("ADMIN"),
    USER("USER");

    private String type;

    RoleType(String type) {
        this.type = type;
    }

    public static String getNameByType(RoleType roleType) {
        if ("ADMIN".equals(roleType.name())) {
            return "Admin";
        } else if ("USER".equals(roleType.name())) {
            return "User";
        } else {
            return null;
        }
    }

    public static RoleType getTypeByName(String name) {
        if ("Admin".equals(name)) {
            return RoleType.ADMIN;
        } else if ("User".equals(name)) {
            return RoleType.USER;
        } else {
            return null;
        }
    }
}
