package com.itsp.flyway.repo;

import com.itsp.flyway.beanpassword.Password;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordRepo extends JpaRepository<Password, Integer> {

}
