package com.example.demomybatis2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	
	public Car(String string, String string2, String string3, Object object) {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	
	private String make, model;
	private int year;
	private Long id;
	
	

	
	
	
}
