package com.github.joaoh4547.factory_method;

import com.github.joaoh4547.factory_method.vehicles.IVehicle;

public abstract class Transport {
	
	void startTransport() {
		IVehicle vehicle = this.createTransport();
		vehicle.startRoute();
	}
	
	protected abstract IVehicle createTransport();
}
	