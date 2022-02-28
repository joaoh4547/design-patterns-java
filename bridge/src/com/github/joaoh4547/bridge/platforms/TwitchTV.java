package com.github.joaoh4547.bridge.platforms;

public class TwitchTV implements IPlatform {

	public TwitchTV() {
		configureRMTP();
		System.out.println("TwitchTV: Transmissão Iniciada");
	}

	@Override
	public void configureRMTP() {

		auth();
		System.out.println("TwitchTV: Conta autorizada");
	}

	@Override
	public void auth() {

		System.out.println("TwitchTV: Autorizando conta");
	}

}
