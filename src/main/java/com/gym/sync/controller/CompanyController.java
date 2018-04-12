package com.gym.sync.controller;

import com.gym.sync.entity.Company;
import com.gym.sync.epo.CompanyEpo;
import com.gym.sync.service.interfaces.ICompanyService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/company")
@RequestMapping(value = "/company")
public class CompanyController implements ICrudController<Company, CompanyEpo> {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    private ICompanyService companyService;

    @Override
    public Company create(CompanyEpo epo) {
        LOGGER.info("Creating company: " + epo + ".");
        return companyService.create(epo);
    }

    @Override
    public List<CompanyEpo> getAll() {
        LOGGER.info("Getting all companies.");
        return companyService.getAll();
    }

    @Override
    public Company update(CompanyEpo epo) {
        LOGGER.info("Updating company to: " + epo + ".");
        return companyService.update(epo);
    }

    @Override
    public Company delete(long id) {
        LOGGER.info("Deleting company with id: " + id + ".");
        return companyService.delete(id);
    }
}
