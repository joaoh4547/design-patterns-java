package com.github.com.abstract_factory.app;

import com.github.com.abstract_factory.aircrafts.IAircraft;
import com.github.com.abstract_factory.factories.ITransportFactory;
import com.github.com.abstract_factory.landvehicles.ILandVehicle;

public class Configuration {
	private ILandVehicle vehicle;
	private IAircraft aircraft;
	
	public Configuration(ITransportFactory transportFactory) {
		vehicle = transportFactory.createTransportVehicle();
		aircraft = transportFactory.createTransportAircraft();
	}
	
	public void startRoute() {
		vehicle.startRoute();
		System.out.println();
		aircraft.startRoute();
	}
}
