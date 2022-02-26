package com.github.com.abstract_factory.factories;

import com.github.com.abstract_factory.aircrafts.Airplane;
import com.github.com.abstract_factory.aircrafts.IAircraft;
import com.github.com.abstract_factory.landvehicles.Car;
import com.github.com.abstract_factory.landvehicles.ILandVehicle;

public class UberTransportFactory implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {
		return new Car();
	}

	@Override
	public IAircraft createTransportAircraft() {
		return new Airplane();
	}

}
