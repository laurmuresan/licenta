package com.gym.sync.repository;

import com.gym.sync.entity.utility.DailyReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuresan
 */
@Repository
public interface DailyReportRepository extends CrudRepository<DailyReport, Long> {

}
