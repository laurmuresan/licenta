package com.gym.sync.service;

import com.gym.sync.entity.Company;
import com.gym.sync.epo.CompanyEpo;
import com.gym.sync.mapper.CompanyEpoMapper;
import com.gym.sync.mapper.LocationEpoMapper;
import com.gym.sync.repository.CompanyRepository;
import com.gym.sync.service.interfaces.ICompanyService;
import com.gym.sync.service.interfaces.ICrudService;
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
public class CompanyServiceImpl implements ICrudService<Company, CompanyEpo>, ICompanyService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CompanyServiceImpl.class);

    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private CompanyEpoMapper companyEpoMapper;
    @Autowired
    private LocationEpoMapper locationEpoMapper;

    @Override
    public Company create(CompanyEpo epo) {
        Company company = companyEpoMapper.toInternal(epo);
        LOGGER.info("Creating company: " + company + ".");
        return companyRepository.save(company);
    }

    @Override
    public List<CompanyEpo> getAll() {
        LOGGER.info("Getting all companies.");
        return companyEpoMapper.toExternals(Lists.newArrayList(companyRepository.findAll()));
    }

    @Override
    public Company update(CompanyEpo epo) {
        Company company = companyRepository.findOne(epo.getId());
        LOGGER.info("Updating company: " + company + ".");

        company.setName(epo.getName());
        company.setDescription(epo.getDescription());
        company.setLocation(locationEpoMapper.toInternal(epo.getLocation()));
        company.setPhoneNumber(epo.getPhoneNumber());
        company.setSocialMediaLink(epo.getSocialMediaLink());

        return companyRepository.save(company);
    }

    @Override
    public Company delete(long id) {
        Company company = companyRepository.findOne(id);
        LOGGER.info("Deleting company: " + company + ".");
        companyRepository.delete(company);
        return company;
    }
}
