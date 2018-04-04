package com.gym.sync.mapper;

import com.gym.sync.entity.Event;
import com.gym.sync.epo.EventEpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author laurmuresan
 */
@Service
public class EventEpoMapper extends GenericMapper<Event, EventEpo> {

    @Autowired
    private LocationEpoMapper locationEpoMapper;

    public Event toInternal(EventEpo epo) {
        return new Event(epo.getId(), epo.getName(), epo.getDate(), epo.getDetails(),
                locationEpoMapper.toInternal(epo.getLocation()), epo.getPhone(), epo.getStartEvent(), epo.getEndEvent());
    }

    public EventEpo toExternal(Event model) {
        return new EventEpo(model.getId(), model.getName(), model.getDate(), model.getDetails(),
                locationEpoMapper.toExternal(model.getLocation()), model.getPhone(),
                model.getStartEvent(), model.getEndEvent());
    }
}
