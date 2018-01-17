package com.gym.sync.epo.list;

import com.gym.sync.epo.EventEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class EventEpoList implements Serializable {

    private static final long serialVersionUID = -6735187014408843768L;

    private List<EventEpo> eventEpoList;

    private EventEpoList() {
    }

    public EventEpoList(List<EventEpo> eventEpoList) {
        this.eventEpoList = eventEpoList;
    }

    public List<EventEpo> getEventEpoList() {
        return eventEpoList;
    }

    @Override
    public String toString() {
        return "EventEpoList{" +
                "eventEpoList=" + eventEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEpoList that = (EventEpoList) o;
        return Objects.equals(eventEpoList, that.eventEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(eventEpoList);
    }
}
