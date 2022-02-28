package com.github.joaoh4547.adapter.adapters;

import com.github.joaoh4547.adapter.payoneer.Payonner;
import com.github.joaoh4547.adapter.paypal.IPaypalPayments;
import com.github.joaoh4547.adapter.utils.Token;

public class PayonnerAdapter implements IPaypalPayments {

	private Token token;
	private Payonner payonner;
	
	public PayonnerAdapter(Payonner payonner) {
		this.payonner = payonner;
		System.out.println("Adaptando o payonner com o paypal");
	}
	
	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.payonner.sendPayment();
	}

	@Override
	public void paypalRecive() {		
		this.payonner.recivePayment();
	}

}
