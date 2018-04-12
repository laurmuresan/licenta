package com.gym.sync.mapper;

import com.gym.sync.entity.Gender;
import com.gym.sync.entity.User;
import com.gym.sync.epo.UserEpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author laurmuresan
 */
@Service
public class UserEpoMapper extends GenericMapper<User, UserEpo> {

    @Autowired
    private PhotoEpoMapper photoEpoMapper;
    @Autowired
    private RoleEpoMapper roleEpoMapper;
    @Autowired
    private DietEpoMapper dietEpoMapper;
    @Autowired
    private GoalEpoMapper goalEpoMapper;

    @Override
    public User toInternal(UserEpo epo) {
        return new User(epo.getId(), epo.getFirstName(), epo.getLastName(), epo.getEmail(), epo.getUsername(),
                epo.getPassword(), Gender.getTypeByName(epo.getGender()), epo.getBirthDate(), epo.getHeight(),
                epo.getWeight(), epo.getPhoneNumber(), epo.getAddress(), roleEpoMapper.toInternal(epo.getRole()),
                photoEpoMapper.toInternal(epo.getPhoto()), goalEpoMapper.toInternal(epo.getGoal()),
                dietEpoMapper.toInternals(epo.getDietList()));
    }

    @Override
    public UserEpo toExternal(User model) {
        return new UserEpo(model.getId(), model.getFirstName(), model.getLastName(), model.getEmail(),
                model.getPassword(), model.getUsername(), Gender.getNameByType(model.getGender()), model.getBirthDate(),
                model.getHeight(), model.getWeight(), model.getPhoneNumber(), model.getAddress(),
                roleEpoMapper.toExternal(model.getRole()), photoEpoMapper.toExternal(model.getPhoto()),
                goalEpoMapper.toExternal(model.getGoal()),
                dietEpoMapper.toExternals(model.getDietList()));
    }
}
