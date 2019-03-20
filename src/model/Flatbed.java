package model;

public class Flatbed{
	
	private double currentAngle = 0;
		
	/**
	 * Lifts up the flatbed with the given double. Check so the current angle won't be bigger than 70 och less than 0.
	 * @param double angle
	 */
	public void liftUp(double angle) {
		
		if(angle >= 70) {
			currentAngle = 70;
		}
		
		else if(angle <= 0){
			currentAngle = 0;			
		}
		
		else {
			currentAngle += angle;
		}
		
	}
	
	/**
	 * Lifts up the flatbed with the given double. Checks so the current angle won't be less than 0 or bigger than 70.
	 * @param angle
	 */
	public void liftDown(double angle) {
		
		if(angle <= 0) {
			currentAngle = 0;	
		}
		else if(angle >= 70){
			currentAngle = 70;
		}
		
		else {
			currentAngle -= angle;
		}
		
		
	}
	
	/**
	 * Returns the current angle
	 * @return double currentAngle
	 */
	public double getCurrentAngle() {
		
		return currentAngle;
		
	}
		
}