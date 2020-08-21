package com.orbit.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Planet class that represents a planet object. All planets have 
 * the following: id, name, orbit speed, spin speed, color, radius, and image location.
 * 
 * Each planet along with its fields is mapped to planets found in the database,
 * this is achieved through @annotations from the Java Persistence API. 
 * 
 * @author Alex Kamieniarczyk
*/

@Entity
@Table(name = "planets")
public class Planet {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int orbitSpeed;
	
	@Column
	private int spinSpeed;
	
	@Column
	private String color;
	
	@Column
	private int radius;
	
	@Column
	private String filePath;
	
	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrbitSpeed() {
		return orbitSpeed;
	}

	public void setOrbitSpeed(int orbitSpeed) {
		this.orbitSpeed = orbitSpeed;
	}

	public int getSpinSpeed() {
		return spinSpeed;
	}

	public void setSpinSpeed(int spinSpeed) {
		this.spinSpeed = spinSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	// hashCode(), equals(), toString() overwritten below. 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + orbitSpeed;
		result = prime * result + radius;
		result = prime * result + spinSpeed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (filePath == null) {
			if (other.filePath != null)
				return false;
		} else if (!filePath.equals(other.filePath))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orbitSpeed != other.orbitSpeed)
			return false;
		if (radius != other.radius)
			return false;
		if (spinSpeed != other.spinSpeed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", orbitSpeed=" + orbitSpeed + ", spinSpeed=" + spinSpeed
				+ ", color=" + color + ", radius=" + radius + ", filePath=" + filePath + "]";
	}
	
	
	
}