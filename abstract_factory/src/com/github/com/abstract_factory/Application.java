package com.github.com.abstract_factory;

import com.github.com.abstract_factory.app.Configuration;
import com.github.com.abstract_factory.factories.ITransportFactory;
import com.github.com.abstract_factory.factories.NineNineTransportFactory;
import com.github.com.abstract_factory.factories.UberTransportFactory;

public class Application {
	
	public static Configuration configureApplication() {
	
		ITransportFactory factory;
		
		String company = "uber";
		
		if(company == "99") {
			factory = new UberTransportFactory();
		}
		else {
			factory = new NineNineTransportFactory();
		}
		
		return new Configuration(factory);
	} 
	
	public static void main(String[] args) {
		Configuration config = configureApplication();
		config.startRoute();
	}

}
