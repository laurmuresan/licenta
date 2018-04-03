package com.gym.sync.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "role")
@SequenceGenerator(sequenceName = "role_seq", allocationSize = 1, name = "role_seq")
public class Role implements Serializable {

    private static final long serialVersionUID = -6479185245407884679L;

    private long id;
    private RoleType roleType;

    public Role() {

    }

    public Role(long id, RoleType roleType) {
        this.id = id;
        this.roleType = roleType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
    @Column(name = "role_id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (id != role.id) return false;
        return roleType == role.roleType;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (roleType != null ? roleType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleType=" + roleType +
                '}';
    }
}
