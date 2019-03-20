package model;

import javafx.scene.paint.Color;

public abstract class Car extends Vehicle{

	/**
	 * Takes in an enginepower(double), a color(color), a modelname(string) and a trimfactor(dobule)
	 * @param ep
	 * @param c
	 * @param mn
	 * @param tf
	 */
	public Car(double ep, Color c, String mn) {
		
		super(ep,c,mn);
		
	}
	
}
