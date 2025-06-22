package com.project.springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springsecurity.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
