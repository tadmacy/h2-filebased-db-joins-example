package com.tadmacy.h2.filebased.db.example.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	@Query("SELECT u from User u LEFT JOIN u.occupation type")
	public List findWithOcc();
}