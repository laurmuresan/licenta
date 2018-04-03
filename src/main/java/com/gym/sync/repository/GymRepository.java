package com.gym.sync.repository;

import com.gym.sync.entity.Gym;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuresan
 */
@Repository
public interface GymRepository extends CrudRepository<Gym, Long> {
}
