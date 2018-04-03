package com.gym.sync.repository;

import com.gym.sync.entity.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuresan
 */
@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {
}
