package com.gym.sync.service;

import com.gym.sync.entity.Event;
import com.gym.sync.epo.EventEpo;
import com.gym.sync.mapper.EventEpoMapper;
import com.gym.sync.mapper.LocationEpoMapper;
import com.gym.sync.repository.EventRepository;
import jersey.repackaged.com.google.common.collect.Lists;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author laurmuresan
 */
@Service
@Transactional
public class EventServiceImpl implements ICrudService<Event, EventEpo>, IEventService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(EventServiceImpl.class);

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private EventEpoMapper eventEpoMapper;
    @Autowired
    private LocationEpoMapper locationEpoMapper;

    @Override
    public Event create(EventEpo epo) {
        Event event = eventEpoMapper.toInternal(epo);
        LOGGER.info("Creating event: " + event + ".");
        return eventRepository.save(event);
    }

    @Override
    public List<EventEpo> getAll() {
        LOGGER.info("Getting all events.");
        return eventEpoMapper.toExternals(Lists.newArrayList(eventRepository.findAll()));
    }

    @Override
    public Event update(EventEpo epo) {
        Event event = eventRepository.findOne(epo.getId());
        LOGGER.info("Updating event: " + event + ".");

        event.setDate(epo.getDate());
        event.setDetails(epo.getDetails());
        event.setStartEvent(epo.getStartEvent());
        event.setEndEvent(epo.getEndEvent());
        event.setName(epo.getName());
        event.setPhone(epo.getPhone());
        event.setLocation(locationEpoMapper.toInternal(epo.getLocation()));

        return eventRepository.save(event);
    }

    @Override
    public Event delete(long id) {
        Event event = eventRepository.findOne(id);
        LOGGER.info("Deleting event: " + event + ".");
        eventRepository.delete(event);
        return event;
    }
}
