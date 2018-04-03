package com.gym.sync.repository;

import com.gym.sync.entity.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuresan
 */
@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}
