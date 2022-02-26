package com.github.joaoh4547.builder.builders;

import com.github.joaoh4547.builder.cars.Truck;
import com.github.joaoh4547.builder.components.CarType;
import com.github.joaoh4547.builder.components.Engine;
import com.github.joaoh4547.builder.components.Transmission;

public class TruckBuilder implements IBuilder {

	
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
	
	
	public Truck build() {
		return new Truck(carType, seats, engine, transmission);
	}
}
