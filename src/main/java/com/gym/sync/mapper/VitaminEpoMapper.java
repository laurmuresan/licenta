package com.gym.sync.mapper;

import com.gym.sync.entity.Vitamin;
import com.gym.sync.epo.VitaminEpo;

/**
 * @author laurmuresan
 */
public class VitaminEpoMapper extends GenericMapper<Vitamin, VitaminEpo> {

    @Override
    public Vitamin toInternal(VitaminEpo epo) {
        return new Vitamin(epo.getId(), epo.getName(), epo.getPercent());
    }

    @Override
    public VitaminEpo toExternal(Vitamin model) {
        return new VitaminEpo(model.getId(), model.getName(), model.getPercent());
    }
}
