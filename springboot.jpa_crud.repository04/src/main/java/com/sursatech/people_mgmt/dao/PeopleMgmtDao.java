package com.sursatech.people_mgmt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sursatech.people_mgmt.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {

	List<Person> findByLastName(String lastName);
	
	List<Person> findByLastNameAndEmail(String lastName, String email);
}
