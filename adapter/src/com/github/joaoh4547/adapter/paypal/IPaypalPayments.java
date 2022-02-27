package com.github.joaoh4547.adapter.paypal;

import com.github.joaoh4547.adapter.utils.Token;

public interface IPaypalPayments {
	Token authToken();

	void paypalPayment();

	void paypalRecive();
}
