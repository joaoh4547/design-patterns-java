package com.github.joaoh4547.adapter;

import com.github.joaoh4547.adapter.adapters.PayonnerAdapter;
import com.github.joaoh4547.adapter.payoneer.Payonner;
import com.github.joaoh4547.adapter.paypal.IPaypalPayments;


public class Application {
	public static void main(String[] args) {
		IPaypalPayments payment = new PayonnerAdapter(new Payonner());
		payment.paypalPayment();
		payment.paypalRecive();
	
	}
}
