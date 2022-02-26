package com.github.joaoh4547.factory_method.vehicles;

public class Bike implements IVehicle {

	@Override
	public void startRoute() {
		this.getCargo();
		System.out.println("Iniciando a entrega");
		
	}

	@Override
	public void getCargo() {
		System.out.println("Pegango a comida");
		
	}

}
