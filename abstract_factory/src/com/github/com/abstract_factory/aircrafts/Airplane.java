package com.github.com.abstract_factory.aircrafts;

public class Airplane implements IAircraft{

	@Override
	public void startRoute() {		
		this.wind();
		this.getCargo();
		System.out.println("Iniciando a decolagem");
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiros a bordo");
	}

	@Override
	public void wind() {
		System.out.println("Ventos a 25KM/H, ventos OK");
	}

}
