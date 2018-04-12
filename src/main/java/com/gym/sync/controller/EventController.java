package com.gym.sync.controller;

import com.gym.sync.entity.Event;
import com.gym.sync.epo.EventEpo;
import com.gym.sync.service.interfaces.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/event")
@RequestMapping(value = "/event")
public class EventController implements ICrudController<Event, EventEpo> {

    @Autowired
    private IEventService eventService;

    @Override
    public Event create(EventEpo epo) {
        return eventService.create(epo);
    }

    @Override
    public List<EventEpo> getAll() {
        return eventService.getAll();
    }

    @Override
    public Event update(EventEpo epo) {
        return eventService.update(epo);
    }

    @Override
    public Event delete(long id) {
        return eventService.delete(id);
    }
}
