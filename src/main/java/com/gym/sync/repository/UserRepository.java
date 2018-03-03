package com.gym.sync.repository;

import com.gym.sync.entity.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author laurmuresan
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
