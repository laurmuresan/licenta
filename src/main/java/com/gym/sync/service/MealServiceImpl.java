package com.gym.sync.service;

import com.gym.sync.entity.Meal;
import com.gym.sync.entity.MealType;
import com.gym.sync.epo.MealEpo;
import com.gym.sync.mapper.FoodEpoMapper;
import com.gym.sync.mapper.MealEpoMapper;
import com.gym.sync.repository.MealRepository;
import com.gym.sync.service.interfaces.IMealService;
import jersey.repackaged.com.google.common.collect.Lists;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author laurmuresan
 */
@Service
@Transactional
public class MealServiceImpl implements IMealService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MealServiceImpl.class);

    @Autowired
    private MealRepository mealRepository;
    @Autowired
    private MealEpoMapper mealEpoMapper;
    @Autowired
    private FoodEpoMapper foodEpoMapper;

    @Override
    public Meal create(MealEpo epo) {
        Meal meal = mealEpoMapper.toInternal(epo);
        LOGGER.info("Creating meal: " + meal + ".");
        return mealRepository.save(meal);
    }

    @Override
    public List<MealEpo> getAll() {
        LOGGER.info("Getting all meals.");
        return mealEpoMapper.toExternals(Lists.newArrayList(mealRepository.findAll()));
    }

    @Override
    public Meal update(MealEpo epo) {
        Meal meal = mealRepository.findOne(epo.getId());
        LOGGER.info("Updating meal: " + meal + ".");

        meal.setCalories(epo.getCalories());
        meal.setFoodList(foodEpoMapper.toInternals(epo.getFoodList()));
        meal.setMealType(MealType.getTypeByName(epo.getMealType()));

        return meal;
    }

    @Override
    public Meal delete(long id) {
        Meal meal = mealRepository.findOne(id);
        LOGGER.info("Deleting meal: " + meal + ".");
        mealRepository.delete(meal);
        return meal;
    }
}
