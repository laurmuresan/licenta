package com.gym.sync.service;

import com.gym.sync.entity.Diet;
import com.gym.sync.entity.DietType;
import com.gym.sync.epo.DietEpo;
import com.gym.sync.mapper.DietEpoMapper;
import com.gym.sync.mapper.MealEpoMapper;
import com.gym.sync.repository.DietRepository;
import com.gym.sync.service.interfaces.IDietService;
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
public class DietServiceImpl implements IDietService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DietServiceImpl.class);

    @Autowired
    private DietRepository dietRepository;
    @Autowired
    private DietEpoMapper dietEpoMapper;
    @Autowired
    private MealEpoMapper mealEpoMapper;

    @Override
    public Diet create(DietEpo epo) {
        Diet diet = dietEpoMapper.toInternal(epo);
        LOGGER.info("Creating diet: " + diet + ".");
        return dietRepository.save(diet);
    }

    @Override
    public List<DietEpo> getAll() {
        LOGGER.info("Getting all diets.");
        return dietEpoMapper.toExternals(Lists.newArrayList(dietRepository.findAll()));
    }

    @Override
    public Diet update(DietEpo epo) {
        Diet diet = dietRepository.findOne(epo.getId());
        LOGGER.info("Updating diet: " + diet + ".");

        diet.setCalories(epo.getCalories());
        diet.setDetails(epo.getDetails());
        diet.setDietType(DietType.getTypeByName(epo.getDietType()));
        diet.setMealList(mealEpoMapper.toInternals(epo.getMealList()));
        diet.setName(epo.getName());

        return dietRepository.save(diet);
    }

    @Override
    public Diet delete(long id) {
        Diet diet = dietRepository.findOne(id);
        LOGGER.info("Deleting diet with id: " + diet + ".");
        dietRepository.delete(diet);
        return diet;
    }
}
