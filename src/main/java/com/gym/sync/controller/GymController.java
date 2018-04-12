package com.gym.sync.controller;

import com.gym.sync.entity.Gym;
import com.gym.sync.epo.GymEpo;
import com.gym.sync.service.interfaces.IGymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/gym")
@RequestMapping(value = "/gym")
public class GymController implements ICrudController<Gym, GymEpo> {

    @Autowired
    private IGymService gymService;

    @Override
    public Gym create(GymEpo epo) {
        return gymService.create(epo);
    }

    @Override
    public List<GymEpo> getAll() {
        return gymService.getAll();
    }

    @Override
    public Gym update(GymEpo epo) {
        return gymService.update(epo);
    }

    @Override
    public Gym delete(long id) {
        return gymService.delete(id);
    }
}
