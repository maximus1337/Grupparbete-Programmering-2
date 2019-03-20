package model;
import javafx.scene.paint.Color;

public class Volvo740 extends Car{
	
	private static final double trimFactor = 1.2;
	
	public Volvo740(double ep, Color c, String mn) {
		
		super(ep, c, mn);
		
	}

	@Override
	public double speedFactor() {
		// TODO Auto-generated method stub
		return getEnginePower() * .01 * trimFactor;
	}

}