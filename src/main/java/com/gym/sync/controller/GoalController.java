package com.gym.sync.controller;

import com.gym.sync.entity.Goal;
import com.gym.sync.epo.GoalEpo;
import com.gym.sync.service.interfaces.IGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/goal")
@RequestMapping(value = "/goal")
public class GoalController implements ICrudController<Goal, GoalEpo> {

    @Autowired
    private IGoalService goalService;

    @Override
    public Goal create(GoalEpo epo) {
        return goalService.create(epo);
    }

    @Override
    public List<GoalEpo> getAll() {
        return goalService.getAll();
    }

    @Override
    public Goal update(GoalEpo epo) {
        return goalService.update(epo);
    }

    @Override
    public Goal delete(long id) {
        return goalService.delete(id);
    }
}
