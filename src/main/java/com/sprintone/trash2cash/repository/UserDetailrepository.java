package com.sprintone.trash2cash.repository;

import com.sprintone.trash2cash.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserDetailrepository extends JpaRepository<UserDetails,Integer> {
}
