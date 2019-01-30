import javafx.scene.paint.Color;

public class Car {

	public double enginePower;
	public double engineSpeed;
	public Color color;
	public String modelName;
	public double currentSpeed;
	public double trimFactor;
	
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

	public void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	public void decrementSpeed(double amount) {
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
