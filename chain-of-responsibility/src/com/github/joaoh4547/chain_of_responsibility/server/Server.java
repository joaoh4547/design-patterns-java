package com.github.joaoh4547.chain_of_responsibility.server;

import java.util.HashMap;
import java.util.Map;

import com.github.joaoh4547.chain_of_responsibility.middlewares.Middleware;

public class Server {
	private Map<String, String> users = new HashMap<>();
	
	private Middleware middleware;
	
	public void setMiddleware(Middleware middleware) {
		this.middleware = middleware;
	}
	
	public Boolean logIn(String email,String password) {
		if(middleware.check(email, password)) {
			System.out.println("Autenticado");
			System.out.println("Bem vindo");
			return true;
		}
		return false;
	}
	
	public void registerUser(String email,String password) {
		this.users.put(email, password);
	}
	
	public Boolean hasEmail(String email) {
		return users.containsKey(email);
	}
	
	public Boolean isValidPassword(String email,String password) {
		return users.get(email).equals(password);
	}
}
