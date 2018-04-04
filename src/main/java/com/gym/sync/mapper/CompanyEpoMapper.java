package com.gym.sync.mapper;

import com.gym.sync.entity.Company;
import com.gym.sync.epo.CompanyEpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author laurmuresan
 */
@Service
public class CompanyEpoMapper extends GenericMapper<Company, CompanyEpo> {

    @Autowired
    private LocationEpoMapper locationEpoMapper;

    @Override
    public Company toInternal(CompanyEpo epo) {
        return new Company(epo.getId(), epo.getName(), locationEpoMapper.toInternal(epo.getLocation()),
                epo.getPhoneNumber(), epo.getSocialMediaLink(), epo.getDescription());
    }

    @Override
    public CompanyEpo toExternal(Company model) {
        return new CompanyEpo(model.getId(), model.getName(), locationEpoMapper.toExternal(model.getLocation()),
                model.getPhoneNumber(), model.getSocialMediaLink(), model.getDescription());
    }
}
