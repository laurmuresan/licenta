package com.gym.sync.repository;

import com.gym.sync.entity.company.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * @author laurmuresan
 */
public interface CompanyRepository extends CrudRepository<Company, Long> {
}
