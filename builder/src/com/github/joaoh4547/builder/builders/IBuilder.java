package com.github.joaoh4547.builder.builders;

import com.github.joaoh4547.builder.components.CarType;
import com.github.joaoh4547.builder.components.Engine;
import com.github.joaoh4547.builder.components.Transmission;

public interface IBuilder {
	void setCarType(CarType carType);

	void setSeats(Integer seats);

	void setTransmission(Transmission transmission);

	void setEngine(Engine engine);
}
