package Cars;

import Vehicles.Car;
import javafx.scene.paint.Color;

public class Saab95 extends Car{

	private boolean turboOn;

	public Saab95(double ep, Color c, String mn, double tf) {
		
		super(ep, c, mn, tf);
		
	}

	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}

}