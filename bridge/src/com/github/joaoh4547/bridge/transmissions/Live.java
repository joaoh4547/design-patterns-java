package com.github.joaoh4547.bridge.transmissions;

public class Live implements ITransmission {
	
	public Live() {
		
	}
	
	@Override
	public void broadcasting() {
		System.out.println("Iniciando a transmissão");
		
	}

	@Override
	public void result() {
		System.out.println("*** Transmissão no ar ***");
		
	}

}
