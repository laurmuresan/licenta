package com.gym.sync.epo.list;

import com.gym.sync.epo.RoleEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class RoleEpoList implements Serializable {

    private static final long serialVersionUID = -7058599451656902846L;

    private List<RoleEpo> roleEpoList;

    private RoleEpoList() {
    }

    public RoleEpoList(List<RoleEpo> roleEpoList) {
        this.roleEpoList = roleEpoList;
    }

    public List<RoleEpo> getRoleEpoList() {
        return roleEpoList;
    }

    @Override
    public String toString() {
        return "RoleEpoList{" +
                "roleEpoList=" + roleEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEpoList that = (RoleEpoList) o;
        return Objects.equals(roleEpoList, that.roleEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roleEpoList);
    }
}
