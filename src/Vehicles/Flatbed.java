package Vehicles;
public class Flatbed{
	
	double currentAngle = 0;
	double currentAngleTemp;
		
	/**
	 * Lifts up the flatbed with the given double. Check so the current angle won't be bigger than 70 och less than 0.
	 * @param double angle
	 */
	public void liftUp(double angle) {
		
		currentAngleTemp = currentAngle + angle;
		
		if(checkAngle(currentAngleTemp)) {
			currentAngle += angle;
		}
		else {
			currentAngle = currentAngle;
		}
		
	}
	
	/**
	 * Lifts up the flatbed with the given double. Checks so the current angle won't be less than 0 or bigger than 70.
	 * @param angle
	 */
	public void liftDown(double angle) {
		
		currentAngleTemp = currentAngle - angle;
		
		if(checkAngle(currentAngleTemp)) {
			currentAngle -= angle;	
		}
		else {
			currentAngle = currentAngle;
		}
		
		
	}
	
	/**
	 * Returns the current angle
	 * @return double currentAngle
	 */
	public double getCurrentAngle() {
		
		return currentAngle;
		
	}
	
	/**
	 * Checking if the given angle is less than 0 or bigger than 70. If it's bigger than 70 or less than 0, it returns false. Else it returns true.
	 * @param double angle
	 * @return boolean
	 */
	private boolean checkAngle(double angle) {
		
		if(angle < 0) {
			return false;
		}
		else if(angle > 70) {
			return false;
		}
		else {
			return true;
		}
		
	}
		
}