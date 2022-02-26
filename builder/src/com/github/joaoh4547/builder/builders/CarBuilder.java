package com.github.joaoh4547.builder.builders;

import com.github.joaoh4547.builder.cars.Car;
import com.github.joaoh4547.builder.components.CarType;
import com.github.joaoh4547.builder.components.Engine;
import com.github.joaoh4547.builder.components.Transmission;

public class CarBuilder implements IBuilder {

	private CarType carType;
	private Integer seats;
	private Transmission transmission;
	private Engine engine;

	@Override
	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	@Override
	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car build() {
		return new Car(carType, seats, engine, transmission);
	}

}
