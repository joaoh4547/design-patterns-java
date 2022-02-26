package com.github.joaoh4547.factory_method;

public class Application {

	private static Transport transport;
	
	public static void main(String[] args)  {
		configure(args[0]);
		if(transport != null) {
			runTransport();
		}
	}

	private static void runTransport() {
		transport.startTransport();
		
	}

	private static void configure(String type) {
		switch (type) {
		case "uber":
			transport = new CarTransport();
			break;
		case "log":
			transport = new MotorcycleTransport();
			break;
		case "eats":
			transport = new BikeTransport();
			break;
		default:
			System.out.println("Selecione o tipo de entrega !!!");
			System.exit(0);
		}
	}
}
