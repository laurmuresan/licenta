package com.gym.sync.repository;

import com.gym.sync.entity.meal.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuresan
 */
@Repository
public interface MealRepository extends CrudRepository<Meal,Long>{
}
