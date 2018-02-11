package com.bjit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bjit.spring.model.Tester;

@Repository
public interface TesterRepository extends CrudRepository<Tester, Integer>{

}
