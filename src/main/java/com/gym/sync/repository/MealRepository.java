package com.gym.sync.repository;

import com.gym.sync.entity.meal.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author laurmuresan
 */
@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {
    List<Meal> getAllByDietId(long dietId);
}
