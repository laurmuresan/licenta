package com.gym.sync.mapper;

import com.gym.sync.entity.user.User;
import com.gym.sync.epo.FoodEpo;
import com.gym.sync.epo.UserEpo;
import com.gym.sync.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author laurmuresan
 */
public class UserEpoMapper {

    @Autowired
    private PhotoMapper photoEpoMapper;

    @Autowired
    private PhotoRepository photoRepository;

    public User toInternal(UserEpo epo) {
        return new User(epo.getId(), epo.getFirstName(), epo.getLastName(), epo.getEmail(), epo.getUsername(), epo.getGender(),
                epo.getBirthDate(), epo.getHeight(), epo.getWeight(), epo.getPhoneNumber(), epo.getAddress(), epo.getRole(), photoEpoMapper.toInternal(epo.getPhoto()))

    }

    public UserEpo toExternal(UserEpo model) {
        return new UserEpo(model.getId(), model.getFirstName(), model.getLastName(), model.getEmail(), model.getUsername(),
                model.getGender(), model.getBirthDate(), model.getHeight(), model.getWeight(), model.getPhoneNumber(), model.getAddress(),
                model.getRole(), photoEpoMapper.toExternal(model.getPhoto()));
    }

    public List<User> toInternals(Collection<UserEpo> epoList{return null;})

    public List<UserEpo> toExternals(Collection<User> modelList){
        List<UserEpo> userEpoList = new ArrayList<>();
        for (User user : modelList) {
          //  userEpoList.add(toExternal(user, photoRepository.))
        }

    }
}
