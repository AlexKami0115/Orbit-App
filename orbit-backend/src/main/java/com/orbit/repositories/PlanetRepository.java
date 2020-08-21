package com.orbit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.orbit.beans.Planet;

/**
 * PlanetRepository extends various interfaces from springframework.data, such as JpaRepository,
 * which allows access to basic CRUD operation queries.  
 * 
 * Custom queries to be added in this interface by using the @Query annotation above methods. 
 * 
 * @author Alex Kamieniarczyk
*/

@RepositoryRestResource()
public interface PlanetRepository extends JpaRepository<Planet, Integer>, JpaSpecificationExecutor<Planet>, QuerydslPredicateExecutor<Planet> {

}
