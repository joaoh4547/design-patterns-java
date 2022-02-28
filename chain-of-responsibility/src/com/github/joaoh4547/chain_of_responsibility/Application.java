package com.github.joaoh4547.chain_of_responsibility;

import java.util.Scanner;

import com.github.joaoh4547.chain_of_responsibility.middlewares.CheckPermissionMiddleware;
import com.github.joaoh4547.chain_of_responsibility.middlewares.CheckUserMiddleware;
import com.github.joaoh4547.chain_of_responsibility.middlewares.Middleware;
import com.github.joaoh4547.chain_of_responsibility.server.Server;

public class Application {

	private static Server server;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			init();

			Boolean done = false;

			do {

				System.out.print("Digite seu email ");
				var email = scanner.nextLine();

				System.out.print("Digite sua senha ");

				var password = scanner.nextLine();

				done = server.logIn(email, password);

			} while (!done);
		}
	}

	public static void init() {
		server = new Server();
		server.registerUser("master.hcode.com", "123456");
		server.registerUser("user.hcode.com", "1234567");

		Middleware middleware = new CheckUserMiddleware(server);
		middleware.linkWith(new CheckPermissionMiddleware());

		server.setMiddleware(middleware);

	}
}
