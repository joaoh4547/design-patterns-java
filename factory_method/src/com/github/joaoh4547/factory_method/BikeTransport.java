package com.github.joaoh4547.factory_method;

import com.github.joaoh4547.factory_method.vehicles.Bike;
import com.github.joaoh4547.factory_method.vehicles.IVehicle;

public class BikeTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Bike();
	}

}
