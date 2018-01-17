package com.gym.sync.epo;

import java.io.Serializable;
import java.util.Objects;

public class VitaminEpo implements Serializable {

    private static final long serialVersionUID = 1103206029508850164L;

    private long id;
    private String name;
    private long percent;

    private VitaminEpo() {
    }

    public VitaminEpo(long id, String name, long percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        return "VitaminEpo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percent=" + percent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VitaminEpo that = (VitaminEpo) o;
        return id == that.id &&
                percent == that.percent &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, percent);
    }
}
