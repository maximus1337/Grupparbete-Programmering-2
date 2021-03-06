package model;

import javafx.scene.paint.Color;

public class Saab95 extends Car{

	private static boolean turboOn = false;

	public Saab95(double ep, Color c, String mn) {
		
		super(ep, c, mn);
		
	}

	public  void setTurboOn() {
		turboOn = true;
	}

	public  void setTurboOff() {
		turboOn = false;
	}

	@Override
	public double speedFactor() {
		double turbo = 1;
		if (turboOn) {
			turbo = 1.3;
		}
		return getEnginePower() * 0.01 * turbo;
	}

}