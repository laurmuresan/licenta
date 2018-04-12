package com.gym.sync.service;

import com.gym.sync.entity.Gym;
import com.gym.sync.entity.GymType;
import com.gym.sync.epo.GymEpo;
import com.gym.sync.mapper.CompanyEpoMapper;
import com.gym.sync.mapper.GymEpoMapper;
import com.gym.sync.mapper.LocationEpoMapper;
import com.gym.sync.repository.GymRepository;
import com.gym.sync.service.interfaces.IGymService;
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
public class GymServiceImpl implements IGymService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(GymServiceImpl.class);

    @Autowired
    private GymRepository gymRepository;
    @Autowired
    private GymEpoMapper gymEpoMapper;
    @Autowired
    private LocationEpoMapper locationEpoMapper;
    @Autowired
    private CompanyEpoMapper companyEpoMapper;

    @Override
    public Gym create(GymEpo epo) {
        Gym gym = gymEpoMapper.toInternal(epo);
        LOGGER.info("Creating gym: " + gym + ".");
        return gymRepository.save(gym);
    }

    @Override
    public List<GymEpo> getAll() {
        return gymEpoMapper.toExternals(Lists.newArrayList(gymRepository.findAll()));
    }

    @Override
    public Gym update(GymEpo epo) {
        Gym gym = gymRepository.findOne(epo.getId());
        LOGGER.info("Updating gym: " + gym + ".");

        gym.setName(epo.getName());
        gym.setLocation(locationEpoMapper.toInternal(epo.getLocation()));
        gym.setWebsite(epo.getWebsite());
        gym.setDetails(epo.getDetails());
        gym.setPhone(epo.getPhone());
        gym.setGymType(GymType.getTypeByName(epo.getGymType()));
        gym.setMondayFridayOpen(epo.getMondayFridayOpen());
        gym.setMondayFridayClose(epo.getMondayFridayClose());
        gym.setSaturdayOpen(epo.getSaturdayOpen());
        gym.setSaturdayClose(epo.getSaturdayClose());
        gym.setSundayOpen(epo.getSundayOpen());
        gym.setSundayClose(epo.getSundayClose());
        gym.setCompany(companyEpoMapper.toInternal(epo.getCompany()));

        return gym;
    }

    @Override
    public Gym delete(long id) {
        Gym gym = gymRepository.findOne(id);
        LOGGER.info("Deleting gym: " + gym + ".");
        gymRepository.delete(gym);
        return gym;
    }
}
