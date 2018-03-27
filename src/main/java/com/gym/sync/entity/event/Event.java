package com.gym.sync.entity.event;

import com.gym.sync.entity.utility.Location;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class Event implements Serializable {

    private static final long serialVersionUID = 5656903129153453979L;

    private String id;
    private String name;
    private LocalDate date;
    private String details;
    private Location location;
    private String phone;
    private LocalDateTime startEvent;
    private LocalDateTime endEvent;

    public Event() {
    }

    public Event(String id, String name, LocalDate date, String details, Location location,
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

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id")
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(LocalDateTime startEvent) {
        this.startEvent = startEvent;
    }

    public LocalDateTime getEndEvent() {
        return endEvent;
    }

    public void setEndEvent(LocalDateTime endEvent) {
        this.endEvent = endEvent;
    }

    @Override
    public String toString() {
        return "Event{" +
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
        Event event = (Event) o;
        return Objects.equals(id, event.id) &&
                Objects.equals(name, event.name) &&
                Objects.equals(date, event.date) &&
                Objects.equals(details, event.details) &&
                Objects.equals(location, event.location) &&
                Objects.equals(phone, event.phone) &&
                Objects.equals(startEvent, event.startEvent) &&
                Objects.equals(endEvent, event.endEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, details, location, phone, startEvent, endEvent);
    }
}
