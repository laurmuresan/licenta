package com.gym.sync.controller;

import com.gym.sync.entity.Diet;
import com.gym.sync.epo.DietEpo;
import com.gym.sync.service.interfaces.IDietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/diet")
@RequestMapping(value = "/diet")
public class DietController implements ICrudController<Diet, DietEpo> {

    @Autowired
    private IDietService dietService;

    @Override
    public Diet create(DietEpo epo) {
        return dietService.create(epo);
    }

    @Override
    public List<DietEpo> getAll() {
        return dietService.getAll();
    }

    @Override
    public Diet update(DietEpo epo) {
        return dietService.update(epo);
    }

    @Override
    public Diet delete(long id) {
        return dietService.delete(id);
    }
}
