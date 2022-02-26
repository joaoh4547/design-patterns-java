package com.github.joaoh4547.factory_method.vehicles;

public class Car implements IVehicle {

	@Override
	public void startRoute() {
		this.getCargo();
		System.out.println("Iniciando o trajeto");
	}

	@Override
	public void getCargo() {		
		System.out.println("Pegando os passageiros");
	}

}
