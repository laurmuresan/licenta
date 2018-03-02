package com.gym.sync.mapper;

import com.gym.sync.entity.event.Event;
import com.gym.sync.epo.EventEpo;
import com.gym.sync.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EventEpoMapper {

    @Autowired
    private LocationEpoMapper locationEpoMapper;

    public Event toInternal(EventEpo epo) {
        return new Event(epo.getId(), epo.getName(), epo.getDate(), epo.getDetails(),
                locationEpoMapper.toInternal(epo.getLocation()), epo.getPhone(), epo.getStartEvent(), epo.getEndEvent());
    }

    public EventEpo toExternal(Event model) {
        return new EventEpo(model.getId(), model.getName(), model.getDate(), model.getDetails(), locationEpoMapper.toExternal(model.getLocation()), model.getPhone(), model.getStartEvent(), model.getEndEvent());
    }

    public List<Event> toInternals(Collection<EventEpo> epoList) {
        return null;
    }

    public List<EventEpo> toExternals(Collection<Event> modelList) {
        List<EventEpo> eventEpoList = new ArrayList<>();
        for (Event event : modelList) {
            eventEpoList.add(toExternal(event));
        }
        return eventEpoList;
    }

}
