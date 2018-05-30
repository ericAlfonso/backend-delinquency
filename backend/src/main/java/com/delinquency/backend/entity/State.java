package com.delinquency.backend.entity;

public class State {


	private String name;
	private String population;
	private int delinquency;


	public String getName() {
		return name;
	}


	public void setName(final String name) {
		this.name = name;
	}


	public String getPopulation() {
		return population;
	}


	public void setPopulation(final String population) {
		this.population = population;
	}

	public int getDelinquency() {
		return delinquency;
	}


	public void setDelinquency(final int delinquency) {
		this.delinquency = delinquency;
	}


	public State(final String name, final String population, final int delinquency) {
		this.name = name;
		this.population = population;
		this.delinquency = delinquency;
	}

}
