package com.github.joaoh4547.adapter.payoneer;

import com.github.joaoh4547.adapter.utils.Token;

public interface IPayonnerPayments {
	Token authToken();

	void sendPayment();

	void recivePayment();
}
