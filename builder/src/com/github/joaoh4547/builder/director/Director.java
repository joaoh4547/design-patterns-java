package com.github.joaoh4547.builder.director;

import com.github.joaoh4547.builder.builders.IBuilder;
import com.github.joaoh4547.builder.components.CarType;
import com.github.joaoh4547.builder.components.Engine;
import com.github.joaoh4547.builder.components.Transmission;

public class Director {
	
	public void constructSedanCar(IBuilder builder) {
		builder.setCarType(CarType.SEDAN);
		builder.setSeats(5);
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setEngine(new Engine(1600));
	}
	
	public void constructTruck(IBuilder builder) {
		builder.setCarType(CarType.TRUCK);
		builder.setSeats(5);
		builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
		builder.setEngine(new Engine(13000));
	}
	
	
}	
