package com.github.joaoh4547.adapter.paypal;

import com.github.joaoh4547.adapter.utils.Token;

public class Paypal implements IPaypalPayments {

	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.token = authToken();

		System.out.println(String.format("Enviando pagamentos para o paypal\nUsando o token: %s\n ", this.token.getToken()));
	}

	@Override
	public void paypalRecive() {	
		System.out.println("Recebendo pagamentos via paypal");

	}

}
