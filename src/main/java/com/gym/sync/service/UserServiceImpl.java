package com.gym.sync.service;

import com.gym.sync.entity.Gender;
import com.gym.sync.entity.User;
import com.gym.sync.epo.UserEpo;
import com.gym.sync.mapper.*;
import com.gym.sync.repository.UserRepository;
import com.gym.sync.service.interfaces.ICrudService;
import com.gym.sync.service.interfaces.IUserService;
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
public class UserServiceImpl implements IUserService {


    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserEpoMapper userEpoMapper;
    @Autowired
    private RoleEpoMapper roleEpoMapper;
    @Autowired
    private PhotoEpoMapper photoEpoMapper;
    @Autowired
    private GoalEpoMapper goalEpoMapper;
    @Autowired
    private DietEpoMapper dietEpoMapper;

    @Override
    public User create(UserEpo epo) {
        User user = userEpoMapper.toInternal(epo);
        LOGGER.info("Creating user: " + user + ".");
        return userRepository.save(user);
    }

    @Override
    public List<UserEpo> getAll() {
        LOGGER.info("Getting all users.");
        return userEpoMapper.toExternals(Lists.newArrayList(userRepository.findAll()));
    }

    @Override
    public User update(UserEpo epo) {
        User user = userRepository.findOne(epo.getId());
        LOGGER.info("Updating user: " + user + ".");

        user.setFirstName(epo.getFirstName());
        user.setLastName(epo.getLastName());
        user.setEmail(epo.getEmail());
        user.setUsername(epo.getUsername());
        user.setPassword(epo.getPassword());
        user.setGender(Gender.getTypeByName(epo.getGender()));
        user.setBirthDate(epo.getBirthDate());
        user.setHeight(epo.getHeight());
        user.setWeight(epo.getWeight());
        user.setPhoneNumber(epo.getPhoneNumber());
        user.setAddress(epo.getAddress());
        user.setRole(roleEpoMapper.toInternal(epo.getRole()));
        user.setPhoto(photoEpoMapper.toInternal(epo.getPhoto()));
        user.setGoal(goalEpoMapper.toInternal(epo.getGoal()));
        user.setDietList(dietEpoMapper.toInternals(epo.getDietList()));

        return user;
    }

    @Override
    public User delete(long id) {
        User user = userRepository.findOne(id);
        LOGGER.info("Deleting user: " + user + ".");
        userRepository.delete(user);
        return user;
    }
}
