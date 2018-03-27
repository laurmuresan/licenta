package com.gym.sync.repository;

import com.gym.sync.entity.utility.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuersan
 */
@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
