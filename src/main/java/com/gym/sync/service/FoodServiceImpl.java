package com.gym.sync.service;

import com.gym.sync.entity.Food;
import com.gym.sync.entity.FoodType;
import com.gym.sync.epo.FoodEpo;
import com.gym.sync.mapper.FoodEpoMapper;
import com.gym.sync.mapper.VitaminEpoMapper;
import com.gym.sync.repository.FoodRepository;
import com.gym.sync.service.interfaces.IFoodService;
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
public class FoodServiceImpl implements IFoodService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(FoodServiceImpl.class);

    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private FoodEpoMapper foodEpoMapper;
    @Autowired
    private VitaminEpoMapper vitaminEpoMapper;

    @Override
    public Food create(FoodEpo epo) {
        Food food = foodEpoMapper.toInternal(epo);
        LOGGER.info("Creating food: " + food + ".");
        return foodRepository.save(food);
    }

    @Override
    public List<FoodEpo> getAll() {
        LOGGER.info("Getting all foods.");
        return foodEpoMapper.toExternals(Lists.newArrayList(foodRepository.findAll()));
    }

    @Override
    public Food update(FoodEpo epo) {
        Food food = foodRepository.findOne(epo.getId());
        LOGGER.info("Updating food: " + food + ".");

        food.setName(epo.getName());
        food.setFoodType(FoodType.getTypeByName(epo.getFoodType()));
        food.setCalories(epo.getCalories());
        food.setSaturatedFat(epo.getSaturatedFat());
        food.setTransFat(epo.getTransFat());
        food.setCholesterol(epo.getCholesterol());
        food.setSodium(epo.getSodium());
        food.setDietaryFiber(epo.getDietaryFiber());
        food.setSugars(epo.getSugars());
        food.setProtein(epo.getProtein());
        food.setVitaminList(vitaminEpoMapper.toInternals(epo.getVitaminList()));

        return foodRepository.save(food);
    }

    @Override
    public Food delete(long id) {
        Food food = foodRepository.findOne(id);
        LOGGER.info("Deleting food: " + food + ".");
        foodRepository.delete(food);
        return food;
    }
}
