package Vehicles;

import javafx.scene.paint.Color;

public class Car extends Vehicle{

	/**
	 * Takes in an enginepower(double), a color(color), a modelname(string) and a trimfactor(dobule)
	 * @param ep
	 * @param c
	 * @param mn
	 * @param tf
	 */
	public Car(double ep, Color c, String mn, double tf) {
		
		super(ep,c,mn,tf);
		
	}
	
}