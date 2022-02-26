package com.github.joaoh4547.builder.cars;

import com.github.joaoh4547.builder.components.CarType;
import com.github.joaoh4547.builder.components.Engine;
import com.github.joaoh4547.builder.components.Transmission;

public class Truck {
	private final CarType carType;
	private final Integer seats;
	private final Engine engine;
	private final Transmission transmission;
	
	public Truck(CarType carType, Integer seats, Engine engine, Transmission transmission) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}
	
	public String result() {
		return String.format("Truck with mothor %d\nTransmission: %s", this.engine.getPower(),this.transmission.name());
	}
}
