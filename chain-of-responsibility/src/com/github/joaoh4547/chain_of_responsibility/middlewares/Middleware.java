package com.github.joaoh4547.chain_of_responsibility.middlewares;

public abstract class Middleware {
	private Middleware next;
	
	public Middleware linkWith(Middleware next) {
		this.next = next;
		return next;
	}
	
	public abstract Boolean check(String email,String password);
	protected Boolean checkNext(String email,String password) {
		if(this.next == null) {
			return true;
		}
		return next.check(email, password);
	}
}
