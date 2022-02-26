package com.github.com.abstract_factory.factories;

import com.github.com.abstract_factory.aircrafts.Helicopter;
import com.github.com.abstract_factory.aircrafts.IAircraft;
import com.github.com.abstract_factory.landvehicles.ILandVehicle;
import com.github.com.abstract_factory.landvehicles.Motorcycle;

public class NineNineTransportFactory implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {
		return new Motorcycle();
	}

	@Override
	public IAircraft createTransportAircraft() {
		return new Helicopter();
	}

}
