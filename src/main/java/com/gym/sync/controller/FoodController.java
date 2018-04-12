package com.gym.sync.controller;

import com.gym.sync.entity.Food;
import com.gym.sync.epo.FoodEpo;
import com.gym.sync.service.interfaces.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/food")
@RequestMapping(value = "/food")
public class FoodController implements ICrudController<Food, FoodEpo> {

    @Autowired
    private IFoodService foodService;

    @Override
    public Food create(FoodEpo epo) {
        return foodService.create(epo);
    }

    @Override
    public List<FoodEpo> getAll() {
        return foodService.getAll();
    }

    @Override
    public Food update(FoodEpo epo) {
        return foodService.update(epo);
    }

    @Override
    public Food delete(long id) {
        return foodService.delete(id);
    }
}
