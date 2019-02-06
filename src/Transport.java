import javafx.scene.paint.Color;

public class Transport extends Car{
	
	Transporttrailer tt = new Transporttrailer();
	
	private int currentX, currentY;
	
	public Transport(double ep, Color c, String mn, double tf) {
		super(ep, c, mn, tf);
	}
	
	/**
	 * Lifts up the lift of the transporttrailer.
	 */
	public void liftUp() {
		
		if(this.getCurrentSpeed() == 0) {
			tt.liftUp();
		}
		else {
			return;
		}
		
	}
	
	/**
	 * Lifts down the lift of the transporttrailer
	 */
	public void liftDown() {
		
		if(this.getCurrentSpeed() == 0) {
			tt.liftDown();
		}
		else {
			return;
		}
		
	}
	
	/**
	 * Adds a car to the trailer. The x and y position has to be atleast 10 units of length from the transport vehicle.
	 * @param Car c
	 */
	public void addCar(Car c) {
		
		if(c.getCurrentX() <= 10 || c.getCurrentY() <= 10) {
			c.setCurrentX(this.currentX);
			c.setCurrentY(this.currentY);
			tt.addCar(c);
		}
		else {
			return;
		}
		
	}
	
	/**
	 * Removes the car from the trailer.
	 * @param c
	 */
	public void removeCar(Car c) {
		
		tt.removeCar(c);
		
	}
	
	/**
	 * Returns true if the lift is up, and returns false if the lift is down.
	 * @return boolean
	 */
	public boolean isLiftUp() {
		
		return tt.isLiftUp();
		
	}
	
}










