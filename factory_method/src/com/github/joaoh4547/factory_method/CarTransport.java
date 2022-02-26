package com.github.joaoh4547.factory_method;

import com.github.joaoh4547.factory_method.vehicles.Car;
import com.github.joaoh4547.factory_method.vehicles.IVehicle;

public class CarTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Car();
	}

}
