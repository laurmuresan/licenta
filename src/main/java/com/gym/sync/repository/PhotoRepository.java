package com.gym.sync.repository;

import com.gym.sync.entity.Photo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuresan
 */
@Repository
public interface PhotoRepository extends CrudRepository<Photo, Long> {
}
