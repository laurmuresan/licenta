package com.gym.sync.mapper;

import com.gym.sync.entity.Goal;
import com.gym.sync.epo.GoalEpo;
import org.springframework.stereotype.Service;

/**
 * @author laurmuresan
 */
@Service
public class GoalEpoMapper extends GenericMapper<Goal, GoalEpo> {

    @Override
    public Goal toInternal(GoalEpo epo) {
        return new Goal(epo.getId(), epo.getWeight(), epo.getDeadline());
    }

    @Override
    public GoalEpo toExternal(Goal model) {
        return new GoalEpo(model.getId(), model.getWeight(), model.getDeadline());
    }
}
