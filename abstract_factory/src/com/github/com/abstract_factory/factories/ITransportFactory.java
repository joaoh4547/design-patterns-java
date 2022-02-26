package com.github.com.abstract_factory.factories;

import com.github.com.abstract_factory.aircrafts.IAircraft;
import com.github.com.abstract_factory.landvehicles.ILandVehicle;

public interface ITransportFactory {
	ILandVehicle createTransportVehicle();
	IAircraft createTransportAircraft();
}
