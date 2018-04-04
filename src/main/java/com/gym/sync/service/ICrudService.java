package com.gym.sync.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author laurmuresan
 */
public interface ICrudService<M, E> {

    M create(E epo);

    @Transactional(readOnly = true)
    List<E> getAll();

    M update(E epo);

    M delete(long id);
}
