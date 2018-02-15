package com.bjit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bjit.spring.model.UserDetail;
@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Integer>{

}
