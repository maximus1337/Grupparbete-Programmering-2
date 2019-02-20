import javafx.scene.paint.Color;
	
public class Boat extends Car{
	
	Transporttrailer tt = new Transporttrailer();
	
	public Boat(double ep, Color c, String mn) {
		super(ep, c, mn, ep);
	}
	
	public void addCar(Car c) {
		tt.addCar(c);
	}
	
}	
	