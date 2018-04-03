package com.gym.sync.repository;

import com.gym.sync.entity.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * @author laurmuresan
 */
public interface CompanyRepository extends CrudRepository<Company, Long> {
}
