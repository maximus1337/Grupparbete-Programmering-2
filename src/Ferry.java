import javafx.scene.paint.Color;

public class Ferry extends Boat{
	
	Transporttrailer tt = new Transporttrailer();
	
	public Ferry(double ep, Color c, String mn) {
		super(ep, c, mn);
	}
	
	public void addCar(Car c) {
		
		tt.addCar(c);
		
	}
	
	public void removeCar() {
		
		tt.cars.remove(tt.getCarsSize());
		
	}
	
}
