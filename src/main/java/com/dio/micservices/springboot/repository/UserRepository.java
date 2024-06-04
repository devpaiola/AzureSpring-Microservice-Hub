package com.dio.micservices.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.micservices.springboot.model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{
        
}
