package com.gym.sync.mapper;

import com.gym.sync.entity.utility.Goal;
import com.gym.sync.epo.GoalEpo;

/**
 * @author laurmuresan
 */
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
