package com.gym.sync.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author laurmuresan
 */
public abstract class GenericMapper<M, E> {

    public abstract M toInternal(E epo);

    public abstract E toExternal(M model);

    public List<M> toInternals(Collection<E> epoList) {
        return epoList.stream()
                .map(this::toInternal)
                .collect(Collectors.toList());
    }

    public List<E> toExternals(Collection<M> modelList) {
        return modelList.stream()
                .map(this::toExternal)
                .collect(Collectors.toList());
    }
}