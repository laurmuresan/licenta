package com.gym.sync.repository;

import com.gym.sync.entity.diet.Diet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author laurmuresan
 */
@Repository
public interface DietRepository extends CrudRepository<Diet, Long> {
    List<Diet> getAllByUserId(long id);
}
