package com.gym.sync.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author laurmuresan
 */
public interface ICrudController<M, E> {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    M create(@RequestBody E epo);

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    List<E> getAll();

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    M update(@RequestBody E epo);

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    M delete(@RequestBody long id);
}
