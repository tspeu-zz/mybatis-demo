package com.example.demomybatis2;






import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoMybatis2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMybatis2Application.class, args);
	}
	
	 
@Bean
CommandLineRunner demo(CarMapper carMapper) {
	return args ->{
		
	//List<Car> carLists  = Arrays.asList(new Car("as","dad","asd",null));	


	//List<Car> cars = new ArrayList<>();
	//cars.add(new Car("Renault", "RXE 1.4", "2000", null));
		
	 List<Car> cars = Arrays.asList(
			 	new Car("Renault", "RXE 1.4", "2000"),
				new Car( "Citroen", "XSara", "2001"),
				new Car( "Renault",  "RXE 1.4","2000")
			 	);
	
	   cars.forEach(car -> {
		    carMapper.insert(car);
		    System.out.println("el carro es: " + car.toString());   
	   		});
	 
	   System.out.println("*-----------------------------------------*");
		carMapper.selecAll().forEach(System.out::println);
	};
}
	
	
}


