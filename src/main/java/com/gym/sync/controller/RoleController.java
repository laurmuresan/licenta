package com.gym.sync.controller;

import com.gym.sync.entity.Role;
import com.gym.sync.epo.RoleEpo;
import com.gym.sync.service.interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/role")
@RequestMapping(value = "/role")
public class RoleController implements ICrudController<Role, RoleEpo> {

    @Autowired
    private IRoleService roleService;

    @Override
    public Role create(RoleEpo epo) {
        return roleService.create(epo);
    }

    @Override
    public List<RoleEpo> getAll() {
        return roleService.getAll();
    }

    @Override
    public Role update(RoleEpo epo) {
        return roleService.update(epo);
    }

    @Override
    public Role delete(long id) {
        return roleService.delete(id);
    }
}
