package com.gym.sync.controller;

import com.gym.sync.entity.Meal;
import com.gym.sync.epo.MealEpo;
import com.gym.sync.service.interfaces.IMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/meal")
@RequestMapping(value = "/meal")
public class MealController implements ICrudController<Meal, MealEpo> {

    @Autowired
    private IMealService mealService;

    @Override
    public Meal create(MealEpo epo) {
        return mealService.create(epo);
    }

    @Override
    public List<MealEpo> getAll() {
        return mealService.getAll();
    }

    @Override
    public Meal update(MealEpo epo) {
        return mealService.update(epo);
    }

    @Override
    public Meal delete(long id) {
        return mealService.delete(id);
    }
}
