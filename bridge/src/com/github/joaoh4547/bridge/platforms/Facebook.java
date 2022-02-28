package com.github.joaoh4547.bridge.platforms;

public class Facebook implements IPlatform {

	public Facebook() {
		configureRMTP();
		System.out.println("Facebook: Transmissão iniciada");
	}

	@Override
	public void configureRMTP() {
		auth();
		System.out.println("Facebook: Conta autorizada");
	}

	@Override
	public void auth() {
		System.out.println("Facebook: Autorizando conta");
	}

}
