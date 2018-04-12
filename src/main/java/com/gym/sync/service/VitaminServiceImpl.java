package com.gym.sync.service;

import com.gym.sync.entity.Vitamin;
import com.gym.sync.epo.VitaminEpo;
import com.gym.sync.mapper.VitaminEpoMapper;
import com.gym.sync.repository.VitaminRepository;
import com.gym.sync.service.interfaces.ICrudService;
import com.gym.sync.service.interfaces.IVitaminService;
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
public class VitaminServiceImpl implements ICrudService<Vitamin, VitaminEpo>, IVitaminService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(VitaminServiceImpl.class);

    @Autowired
    private VitaminRepository vitaminRepository;
    @Autowired
    private VitaminEpoMapper vitaminEpoMapper;

    @Override
    public Vitamin create(VitaminEpo epo) {
        Vitamin vitamin = vitaminEpoMapper.toInternal(epo);
        LOGGER.info("Creating vitamin: " + vitamin + ".");
        return vitamin;
    }

    @Override
    public List<VitaminEpo> getAll() {
        LOGGER.info("Getting all vitamins.");
        return vitaminEpoMapper.toExternals(Lists.newArrayList(vitaminRepository.findAll()));
    }

    @Override
    public Vitamin update(VitaminEpo epo) {
        Vitamin vitamin = vitaminRepository.findOne(epo.getId());
        LOGGER.info("Updating vitamin: " + vitamin + ".");

        vitamin.setName(epo.getName());
        vitamin.setPercent(epo.getPercent());

        return vitamin;
    }

    @Override
    public Vitamin delete(long id) {
        Vitamin vitamin = vitaminRepository.findOne(id);
        LOGGER.info("Deleting vitamin: " + vitamin + ".");
        vitaminRepository.delete(vitamin);
        return vitamin;
    }
}
