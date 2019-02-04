import javafx.scene.paint.Color;

public class Car implements Movable{

	private double enginePower;
	private Color color;
	private String modelName;
	private double currentSpeed;
	private double trimFactor;
	
	private int direction; // 1 = up, 2 = right, 3 = down, 4 = left
	private int currentY, currentX;
	
	/**
	 * Takes in an enginepower(double), a color(color), a modelname(string) and a trimfactor(dobule)
	 * @param ep
	 * @param c
	 * @param mn
	 * @param tf
	 */
	public Car(double ep, Color c, String mn, double tf) {
		
		this.enginePower = ep;
		this.color = c;
		this.modelName = mn;
		this.trimFactor = tf;
		
	}
	
	/**
	 * Returns the engine power
	 * @return double
	 */
	public double getEnginePower() {
		return enginePower;
	}

	/**
	 * Returns the current speed
	 * @return double
	 */
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	/**
	 * Returns the color
	 * @return Color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Starts the engine
	 */
	public void startEngine() {
		currentSpeed = 0.1;
	}
	
	/**
	 * Stops the engine
	 */
	public void stopEngine() {
		currentSpeed = 0;
	}

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}
	
	/**
	 * Increasing the speed
	 * @param double
	 */
	public void gas(double amount) {
		incrementSpeed(amount);
	}
	
	/**
	 * Decreasing the speed
	 * @param double
	 */
	public void brake(double amount) {
		decrementSpeed(amount);
	}
	
	/**
	 * Returns the speedfactor; enginePower * .01 * trimFactor
	 * @return double
	 */
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

	/**
	 * Makes the vehicle move
	 */
	public void move() {
		
		if(direction == 1) { // up
			
			currentY -= currentSpeed;
			
		}
		
		else if(direction == 2) { // right
			
			currentX += currentSpeed;
			
		}
		
		else if(direction == 3) { // down
			
			currentY += currentSpeed;
			
		}
		
		else if(direction == 4) { // left
			
			currentX -= currentSpeed;
			
		}
		
	}

	/**
	 * Makes the vehicle turn left
	 */
	public void turnLeft() {
		
		direction = 4;
		
	}

	/**
	 * Makes the vehicle turn right
	 */
	public void turnRight() {
		
		direction = 2;
		
	}
	
}
