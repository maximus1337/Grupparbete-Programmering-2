package model;
import javafx.scene.paint.Color;

public class Scania extends Car{
	
	Flatbed f = new Flatbed();
	private static final double trimFactor = 1.1;
	
	public Scania(double ep, Color c, String mn) {
		
		super(450, Color.BLUE, "Scania");
		
	}
	
	/**
	 * Lifts up the flatbed with the double angle. The current speed has to be 0. 
	 * @param double
	 */
	public void liftUp(double angle) {
		
		if(getCurrentSpeed() == 0) {
			f.liftUp(angle);
		}
		else {
			return;
		}
		
	}
	
	/**
	 * Lifts down the flatbed with the double angle. The current speed has to be 0.
	 * @param angle
	 */
	public void liftDown(double angle) {
		
		if(getCurrentSpeed() == 0) {
			f.liftDown(angle);
		}
		else {
			return;
		}
		
	}
	
	/**
	 * Return the current angle of the flatbed.
	 * @return double angle
	 */
	public double getAngle() {
		
		return f.getCurrentAngle();
		
	}
	
	public void gas(double amount) {
		
		if(amount > 1 || amount < 0 || this.getAngle() > 0) {
			return;
		}
		else {
			super.gas(amount);
		}
		
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * .001 * trimFactor;
	}
	
}
