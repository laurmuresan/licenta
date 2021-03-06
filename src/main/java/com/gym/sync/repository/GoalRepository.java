package com.gym.sync.repository;

import com.gym.sync.entity.Goal;
import org.springframework.data.repository.CrudRepository;

/**
 * @author laurmuresan
 */
public interface GoalRepository extends CrudRepository<Goal, Long> {
}
