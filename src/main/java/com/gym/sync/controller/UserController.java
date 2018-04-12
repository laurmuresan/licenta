package com.gym.sync.controller;

import com.gym.sync.entity.User;
import com.gym.sync.epo.UserEpo;
import com.gym.sync.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/user")
@RequestMapping(value = "/user")
public class UserController implements ICrudController<User, UserEpo> {

    @Autowired
    private IUserService userService;

    @Override
    public User create(UserEpo epo) {
        return userService.create(epo);
    }

    @Override
    public List<UserEpo> getAll() {
        return userService.getAll();
    }

    @Override
    public User update(UserEpo epo) {
        return userService.update(epo);
    }

    @Override
    public User delete(long id) {
        return userService.delete(id);
    }
}
