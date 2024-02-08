package com.example.oauth20.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.oauth20.models.DBUser;

public interface DBUserRepository extends CrudRepository<DBUser, Integer> {
	public DBUser findByUsername(String username);
}