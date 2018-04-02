package com.gym.sync.repository;

import com.gym.sync.entity.food.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @author laurmuresan
 */
@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {
}
