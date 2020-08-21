package com.orbit.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orbit.beans.Planet;
import com.orbit.services.PlanetService;

import lombok.extern.slf4j.Slf4j;

/**
 * PlanetController takes care of handling requests to /api.
 * It currently supports two HTTP GET requests:
 * 1. Retrieve random planet from the database
 * 2. Retrieve a List of all planets from the database
 * 
 * @author Alex Kamieniarczyk
*/

@Slf4j
@RestController
@RequestMapping("/api/")
public class PlanetController {
	
    @Autowired
    PlanetService planetService;
    
    /**
	 * HTTP GET method (/randomPlanet)
	 * @return A planet that is randomly generated in planetService or a 204 status.
	*/
    @GetMapping(path="/randomPlanet")
	private ResponseEntity<?> getRandomPlanet() {
		Planet planet = planetService.getRandomPlanet();
		
		if (planet == null) 
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		else 
			return ResponseEntity.ok(planet);
	}
    
    /**
	 * HTTP GET method (/planets)
	 * @return A list of all planets in the database.
	*/
    @GetMapping(path="/planets")
	private ResponseEntity<?> getAllPlanets() {
		List<Planet> planets = planetService.getPlanets();
		
		if (planets == null) 
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		else 
			return ResponseEntity.ok(planets);
	}
}