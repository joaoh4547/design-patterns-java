package com.github.joaoh4547.builder;

import com.github.joaoh4547.builder.builders.CarBuilder;
import com.github.joaoh4547.builder.builders.TruckBuilder;
import com.github.joaoh4547.builder.cars.Car;
import com.github.joaoh4547.builder.cars.Truck;
import com.github.joaoh4547.builder.director.Director;

public class Application {
	
	public static void main(String[] args) {
		Director director = new Director();
		
		//criando carro 
		
		CarBuilder builder = new CarBuilder();
		director.constructSedanCar(builder);
		Car car = builder.build();
		
		System.out.println(String.format("%s produzido com sucesso\n\n", car.getCarType()));
		
		TruckBuilder truckBuilder = new TruckBuilder();
		director.constructTruck(truckBuilder);
		Truck truck = truckBuilder.build();
		
		System.out.println(String.format("Caminhão %s ", truck.result()));
	}
}
