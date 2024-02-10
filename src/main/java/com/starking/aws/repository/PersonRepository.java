package com.starking.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starking.aws.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}