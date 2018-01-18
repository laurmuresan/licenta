package com.gym.sync.repository;

import com.gym.sync.entity.food.Vitamin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VitaminRepository extends CrudRepository<Vitamin,Long> {
    @Query(value = "SELECT * FROM vita")
    List<Vitamin> findVitaminByFood(@Param("fid") long food_id);
}
