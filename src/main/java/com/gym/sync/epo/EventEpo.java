package com.gym.sync.epo;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class EventEpo implements Serializable {

    private static final long serialVersionUID = 6586807749962157261L;

    private String id;
    private String name;
    private LocalDate date;
    private String details;
    private LocationEpo location;
    private String phone;
    private LocalDateTime startEvent;
    private LocalDateTime endEvent;

    private EventEpo() {
    }

    public EventEpo(String id, String name, LocalDate date, String details, LocationEpo location,
                    String phone, LocalDateTime startEvent, LocalDateTime endEvent) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.details = details;
        this.location = location;
        this.phone = phone;
        this.startEvent = startEvent;
        this.endEvent = endEvent;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    public LocationEpo getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDateTime getStartEvent() {
        return startEvent;
    }

    public LocalDateTime getEndEvent() {
        return endEvent;
    }

    @Override
    public String toString() {
        return "EventEpo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", details='" + details + '\'' +
                ", location=" + location +
                ", phone='" + phone + '\'' +
                ", startEvent=" + startEvent +
                ", endEvent=" + endEvent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEpo eventEpo = (EventEpo) o;
        return Objects.equals(id, eventEpo.id) &&
                Objects.equals(name, eventEpo.name) &&
                Objects.equals(date, eventEpo.date) &&
                Objects.equals(details, eventEpo.details) &&
                Objects.equals(location, eventEpo.location) &&
                Objects.equals(phone, eventEpo.phone) &&
                Objects.equals(startEvent, eventEpo.startEvent) &&
                Objects.equals(endEvent, eventEpo.endEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, details, location, phone, startEvent, endEvent);
    }
}
