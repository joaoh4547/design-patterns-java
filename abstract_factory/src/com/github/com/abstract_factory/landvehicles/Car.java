package com.github.com.abstract_factory.landvehicles;

public class Car implements ILandVehicle{

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
