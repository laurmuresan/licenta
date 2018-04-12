package com.gym.sync.controller;

import com.gym.sync.entity.Vitamin;
import com.gym.sync.epo.VitaminEpo;
import com.gym.sync.service.interfaces.IVitaminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/vitamin")
@RequestMapping(value = "/vitamin")
public class VitaminController implements ICrudController<Vitamin, VitaminEpo> {

    @Autowired
    private IVitaminService vitaminService;

    @Override
    public Vitamin create(VitaminEpo epo) {
        return vitaminService.create(epo);
    }

    @Override
    public List<VitaminEpo> getAll() {
        return vitaminService.getAll();
    }

    @Override
    public Vitamin update(VitaminEpo epo) {
        return vitaminService.update(epo);
    }

    @Override
    public Vitamin delete(long id) {
        return vitaminService.delete(id);
    }
}
