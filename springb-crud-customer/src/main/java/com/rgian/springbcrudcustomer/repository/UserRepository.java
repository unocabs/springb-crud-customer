package com.rgian.springbcrudcustomer.repository;

import com.rgian.springbcrudcustomer.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
