package model;
import javafx.scene.paint.Color;

public class Ferry extends Boat{
	
	Transporttrailer tt = new Transporttrailer();
	private static final double trimFactor = 1;
	
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

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.00001 * trimFactor;
	}
	
}
