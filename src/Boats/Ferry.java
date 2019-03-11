package Boats;
import Vehicles.Boat;
import Vehicles.Car;
import Vehicles.Transporttrailer;
import javafx.scene.paint.Color;

public class Ferry extends Boat{
	
	Transporttrailer tt = new Transporttrailer();
	
	public Ferry(double ep, Color c, String mn) {
		super(ep, c, mn);
	}
	
	public void addCar(Car c) {
		
		tt.cars.add(c);
		
	}
	
	public void removeCar() {
		
		tt.cars.remove(0);
		
	}
	
	public Car getCar(int x) {
		
		return tt.getCar(x);
		
	}
	
	public String getCars() {
		
		return tt.cars.toString();
		
	}
	
}
