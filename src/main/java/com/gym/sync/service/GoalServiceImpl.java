package com.gym.sync.service;

import com.gym.sync.entity.Goal;
import com.gym.sync.epo.GoalEpo;
import com.gym.sync.mapper.GoalEpoMapper;
import com.gym.sync.repository.GoalRepository;
import com.gym.sync.service.interfaces.ICrudService;
import com.gym.sync.service.interfaces.IGoalService;
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
public class GoalServiceImpl implements IGoalService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(GoalServiceImpl.class);

    @Autowired
    private GoalRepository goalRepository;
    @Autowired
    private GoalEpoMapper goalEpoMapper;

    @Override
    public Goal create(GoalEpo epo) {
        Goal goal = goalEpoMapper.toInternal(epo);
        LOGGER.info("Creating goal: " + goal + ".");
        return goalRepository.save(goal);
    }

    @Override
    public List<GoalEpo> getAll() {
        LOGGER.info("Getting all goals.");
        return goalEpoMapper.toExternals(Lists.newArrayList(goalRepository.findAll()));
    }

    @Override
    public Goal update(GoalEpo epo) {
        Goal goal = goalRepository.findOne(epo.getId());
        LOGGER.info("Updating goal: " + goal + ".");

        goal.setDeadline(epo.getDeadline());
        goal.setWeight(epo.getWeight());

        return goalRepository.save(goal);
    }

    @Override
    public Goal delete(long id) {
        Goal goal = goalRepository.findOne(id);
        LOGGER.info("Deleting goal: " + goal + ".");
        goalRepository.delete(goal);
        return goal;
    }
}
