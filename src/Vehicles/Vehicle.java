package Vehicles;

import javafx.scene.paint.Color;

public class Vehicle implements Movable{

	private double enginePower;
	private Color color;
	private String modelName;
	private double currentSpeed;
	private double trimFactor;
	
	private int direction; // 1 = up, 2 = right, 3 = down, 4 = left
	private double currentY, currentX;
	private double currentSpeedTemp = currentSpeed;
	
	public Vehicle(double ep, Color c, String mn, double tf) {
		
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
	 * Increasing the speed. The speed can't be slowed down.
	 * @param double [0,1]
	 */
	public void gas(double amount) {
		
		currentSpeedTemp = currentSpeed;
		if(amount > 1 || amount < 0) {
			return;
		}
		
		incrementSpeed(amount);
		
		if(currentSpeed > enginePower) {
			currentSpeed = enginePower;
		}
		
		if(currentSpeed < currentSpeedTemp) {
			currentSpeed = currentSpeedTemp;
		}
		
	}
	
	/**
	 * Decreasing the speed. The speed can't get sped up.
	 * @param double [0,1]
	 */
	public void brake(double amount) {
		currentSpeedTemp = currentSpeed; 
		if(amount > 1 || amount < 0) {			
			return;			
		}
		
		decrementSpeed(amount);
		
		if(currentSpeedTemp < currentSpeed) {
			
			currentSpeed = currentSpeedTemp;
			
		}
		
	}
	
	/**
	 * Returns the speedfactor; enginePower * .01 * trimFactor
	 * @return double
	 */
	public double speedFactor() {
		return enginePower * 0.01;
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
	
	/**
	 * Returns the current x-coordinate of the car
	 * @return int currentX
	 */
	public double getCurrentX() {
		
		return currentX;
		
	}
	
	/**
	 * Returns the current y-coordinate of the car
	 * @return int currentY
	 */
	public double getCurrentY() {
		
		return currentY;
		
	}
	
	/**
	 * Change the x position of the car
	 * @param int x
	 */
	public void setCurrentX(int x) {
		
		currentX = x;
		
	}
	
	/**
	 * Changes the y position of th ecar
	 * @param int y
	 */
	public void setCurrentY(int y) {
		
		currentY = y;
		
	}
	
}
