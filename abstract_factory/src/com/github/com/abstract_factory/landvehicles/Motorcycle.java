package com.github.com.abstract_factory.landvehicles;

public class Motorcycle implements ILandVehicle{

	@Override
	public void startRoute() {
		this.getCargo();
		System.out.println("Iniciando a entrega");
	}

	@Override
	public void getCargo() {
		
		System.out.println("Encomenda recebida");
	}

}
