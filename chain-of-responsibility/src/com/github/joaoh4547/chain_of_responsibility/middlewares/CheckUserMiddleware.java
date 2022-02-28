package com.github.joaoh4547.chain_of_responsibility.middlewares;

import com.github.joaoh4547.chain_of_responsibility.server.Server;

public class CheckUserMiddleware extends Middleware {
	
	private Server server;
	
	public CheckUserMiddleware(Server server) {
		this.server = server;
	}
	
	@Override
	public Boolean check(String email, String password) {
		
		if(!server.hasEmail(email)) {
			System.out.println("Email invalido");
			return false;
		}
		
		if(!server.isValidPassword(email, password)) {
			System.out.println("Email/e ou senha incorretos");
			return false;
		}
		
		return checkNext(email, password);
	}

}
