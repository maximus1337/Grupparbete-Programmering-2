package Vehicles;

import javafx.scene.paint.Color;
	
public class Boat extends Car{
	
	Transporttrailer tt;
	
	public Boat(double ep, Color c, String mn) {
		super(ep, c, mn, ep);
		tt = new Transporttrailer();
	}
	
}
