package com.dp.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;


interface Vehicle {
	void start();
	void stop();
	Color getColor();
	
}

class Engine {
	void start() {
		System.out.println("Start Engine");
	}
	
	void stop() {
		System.out.println("Stop Engine");
	}
}

class Car implements Vehicle {
	
	private Engine engine;
	private Color color;
	
	Car(Engine engine, Color color){
		this.engine = engine;
		this.color = color;
	}
	
	public void start() {
		engine.start();
	}
	
	public void stop() {
		engine.stop();
	}
	
	public Color getColor() {
		return this.color;
	}
}


class VehicleFactory {
	
	private static Map<Color, Vehicle> vehicleCache = new HashMap<Color, Vehicle>();
	
	private VehicleFactory() {
		
	}
	
	public static Vehicle createVehicle(Color color) {
		Vehicle newVehicle = vehicleCache.computeIfAbsent(color, newColor -> {
			return new Car(new Engine(), newColor);
		});
		return newVehicle;
	}
	
	public static int count() {
		return vehicleCache.size();
	}

}

class Test{
	public static void main(String[] args) {
		Vehicle blueCar = VehicleFactory.createVehicle(Color.BLUE);
		Vehicle whiteCar = VehicleFactory.createVehicle(Color.WHITE);
		System.out.println("Size:"+VehicleFactory.count());
		
		Vehicle whiteCar2 = VehicleFactory.createVehicle(Color.WHITE);
		System.out.println("Size:"+VehicleFactory.count());
		
		Vehicle redCar = VehicleFactory.createVehicle(Color.RED);
		System.out.println("Size:"+VehicleFactory.count());
		
		
	}
}
