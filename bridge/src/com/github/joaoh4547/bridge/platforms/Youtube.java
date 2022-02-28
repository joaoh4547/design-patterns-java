package com.github.joaoh4547.bridge.platforms;

public class Youtube implements IPlatform {

	public Youtube() {
		configureRMTP();
		System.out.println("Youtube: Transmiss�o iniciada");
	}

	@Override
	public void configureRMTP() {
		auth();
		System.out.println("Youtube: Conta autorizada");

	}

	@Override
	public void auth() {
		System.out.println("Youtube: Autorizando conta");

	}

}
