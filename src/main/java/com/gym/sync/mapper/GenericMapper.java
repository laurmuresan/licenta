package com.gym.sync.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author laurmuresan
 */
public abstract class GenericMapper<M, E extends Object> {

    public abstract M toInternal(E epo);

    public abstract E toExternal(M model);

    public List<M> toInternals(Collection<E> epoList) {
        List<M> modelList = new ArrayList<>();
        epoList.stream().forEach(E -> modelList.add(toInternal(E)));
        return modelList;
    }

    public List<E> toExternals(Collection<M> modelList) {
        List<E> epoList = new LinkedList<>();
        modelList.stream().forEach(M -> epoList.add(toExternal(M)));
        return epoList;
    }
}