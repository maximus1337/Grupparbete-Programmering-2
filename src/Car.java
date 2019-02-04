import javafx.scene.paint.Color;

public class Car {

	private double enginePower;
	private Color color;
	private String modelName;
	private double currentSpeed;
	private double trimFactor;
	
	public Car(double ep, Color c, String mn, double tf) {
		
		this.enginePower = ep;
		this.color = c;
		this.modelName = mn;
		this.trimFactor = tf;
		
	}
	
	public double getEnginePower() {
		return enginePower;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}
	
	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}

	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}
	
}
