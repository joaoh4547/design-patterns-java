package com.github.joaoh4547.adapter.payoneer;

import com.github.joaoh4547.adapter.utils.Token;

public class Payonner implements IPayonnerPayments {

	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void sendPayment() {
		this.token = authToken();
		System.out.println(String.format("Enviando pagamentos com payonner\nUsando o token: %s\n", this.token.getToken()));
	}

	@Override
	public void recivePayment() {
		System.out.println("Recebendo pagamentos com payonner");

	}

}
