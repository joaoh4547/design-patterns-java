package com.github.joaoh4547.adapter.utils;

import java.util.UUID;

public class Token {
	
	private String token;
	
	public Token() {
		this.token = UUID.randomUUID().toString();
	}
	
	public String getToken() {
		return token;
	}
}
