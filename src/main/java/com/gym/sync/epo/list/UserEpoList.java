package com.gym.sync.epo.list;

import com.gym.sync.epo.UserEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class UserEpoList implements Serializable {

    private static final long serialVersionUID = 2313932167926664494L;

    private List<UserEpo> userEpoList;

    private UserEpoList() {
    }

    public UserEpoList(List<UserEpo> userEpoList) {
        this.userEpoList = userEpoList;
    }

    public List<UserEpo> getUserEpoList() {
        return userEpoList;
    }

    @Override
    public String toString() {
        return "UserEpoList{" +
                "userEpoList=" + userEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEpoList that = (UserEpoList) o;
        return Objects.equals(userEpoList, that.userEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userEpoList);
    }
}
