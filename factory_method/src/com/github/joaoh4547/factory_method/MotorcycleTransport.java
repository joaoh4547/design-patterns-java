package com.github.joaoh4547.factory_method;

import com.github.joaoh4547.factory_method.vehicles.IVehicle;
import com.github.joaoh4547.factory_method.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorcycle();
	}

}
