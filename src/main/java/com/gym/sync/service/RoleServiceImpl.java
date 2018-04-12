package com.gym.sync.service;

import com.gym.sync.entity.Role;
import com.gym.sync.entity.RoleType;
import com.gym.sync.epo.RoleEpo;
import com.gym.sync.mapper.RoleEpoMapper;
import com.gym.sync.repository.RoleRepository;
import com.gym.sync.service.interfaces.IRoleService;
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
public class RoleServiceImpl implements IRoleService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleEpoMapper roleEpoMapper;

    @Override
    public Role create(RoleEpo epo) {
        Role role = roleEpoMapper.toInternal(epo);
        LOGGER.info("Creating role: " + role + ".");
        return roleRepository.save(role);
    }

    @Override
    public List<RoleEpo> getAll() {
        LOGGER.info("Getting all roles.");
        return roleEpoMapper.toExternals(Lists.newArrayList(roleRepository.findAll()));
    }

    @Override
    public Role update(RoleEpo epo) {
        Role role = roleRepository.findOne(epo.getId());
        LOGGER.info("Updating role: " + role + ".");
        role.setRoleType(RoleType.getTypeByName(epo.getRoleType()));
        return roleRepository.save(role);
    }

    @Override
    public Role delete(long id) {
        Role role = roleRepository.findOne(id);
        LOGGER.info("Deleting role: " + role + ".");
        roleRepository.delete(role);
        return role;
    }
}
