import javafx.scene.paint.Color;

public class Scania extends Car{
	
	Flatbed f = new Flatbed();
	
	public Scania(double ep, Color c, String mn, double tf) {
		
		super(250, Color.BLUE, "Scania", 1.1);
		
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
	
}
