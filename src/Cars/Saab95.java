package Cars;

import Vehicles.Car;
import javafx.scene.paint.Color;

public class Saab95 extends Car{

	private boolean turboOn;

	public Saab95(double ep, Color c, String mn) {
		
		super(ep, c, mn);
		
	}

	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}

	@Override
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

}