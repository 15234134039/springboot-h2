package com.it.springbooth2.repository;

import com.it.springbooth2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gxp
 * @version 1.0
 * @date 2020/6/29 10:55
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> getLocationsById(Long id);
}
