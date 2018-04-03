package com.gym.sync.mapper;

import com.gym.sync.entity.Role;
import com.gym.sync.entity.RoleType;
import com.gym.sync.epo.RoleEpo;

/**
 * @author laurmuresan
 */
public class RoleEpoMapper extends GenericMapper<Role, RoleEpo> {

    @Override
    public Role toInternal(RoleEpo epo) {
        return new Role(epo.getId(), RoleType.getTypeByName(epo.getRoleType()));
    }

    @Override
    public RoleEpo toExternal(Role model) {
        return new RoleEpo(model.getId(), RoleType.getNameByType(model.getRoleType()));
    }
}
