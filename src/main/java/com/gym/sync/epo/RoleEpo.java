package com.gym.sync.epo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class RoleEpo implements Serializable {

    private static final long serialVersionUID = -6764947669499528069L;

    private long id;
    private String roleType;

    public RoleEpo() {
    }

    public RoleEpo(long id, String roleType) {
        this.id = id;
        this.roleType = roleType;
    }

    public long getId() {
        return id;
    }

    public String getRoleType() {
        return roleType;
    }

    @Override
    public String toString() {
        return "RoleEpo{" +
                "id=" + id +
                ", roleType='" + roleType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEpo roleEpo = (RoleEpo) o;
        return id == roleEpo.id &&
                Objects.equals(roleType, roleEpo.roleType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, roleType);
    }
}
