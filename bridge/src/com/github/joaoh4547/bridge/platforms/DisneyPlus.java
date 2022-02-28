package com.github.joaoh4547.bridge.platforms;

public class DisneyPlus implements IPlatform {
	
	public DisneyPlus() {
		configureRMTP();
		System.out.println("Disneyplus: Transmissão iniciada");
	}
	
	@Override
	public void configureRMTP() {
		auth();
		System.out.println("Disneyplus: Conta autorizada");
		
	}

	@Override
	public void auth() {
		System.out.println("Disneyplus: Autorizando conta");
		
	}

}
