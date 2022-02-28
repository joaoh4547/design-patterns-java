package com.github.joaoh4547.chain_of_responsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware{

	@Override
	public Boolean check(String email, String password) {
		if(email.equals("master.hcode.com")) {
			System.out.println("Bem vindo ADM");
			return true;
		}
		System.out.println("Bem vindo"); 
		return checkNext(email, password);
	}

}
