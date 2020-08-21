package com.orbit.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.orbit.beans.Planet;
import com.orbit.repositories.PlanetRepository;

/**
 * PlanetService makes use of methods from PlanetRepository to retrieve data.
 * 
 * @author Alex Kamieniarczyk
*/

@Component
public class PlanetService {
	
	private PlanetRepository planetRepository;
	
	// holds total of planets in database
	private int numOfPlanets;
	
	// constructor
	public PlanetService(PlanetRepository planetRepository) {
		this.planetRepository = planetRepository;
		this.numOfPlanets = (int) planetRepository.count();
	}
	
	// returns list of all planets in database.
	public List<Planet> getPlanets(){
		return planetRepository.findAll();
	}
	
	// returns Planet if found, or null if not.
	public Planet getRandomPlanet() {
		return planetRepository.findById((int)(Math.random() * numOfPlanets + 0)).get();
	}

}