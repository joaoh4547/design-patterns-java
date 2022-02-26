package com.github.joaoh4547.builder.cars;

import com.github.joaoh4547.builder.components.CarType;
import com.github.joaoh4547.builder.components.Engine;
import com.github.joaoh4547.builder.components.Transmission;

public class Car {

	private final CarType carType;
	private final Integer seats;
	private final Engine engine;
	private final Transmission transmission;

	public Car(CarType carType, Integer seats, Engine engine, Transmission transmission) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}

	public CarType getCarType() {
		return carType;
	}

	public Integer getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}
}
