package com.gym.sync.repository;

import com.gym.sync.entity.Vitamin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuersan
 */
@Repository
public interface VitaminRepository extends CrudRepository<Vitamin, Long> {
}
