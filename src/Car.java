import javafx.scene.paint.Color;

public class Car implements Movable{

	private double enginePower;
	private Color color;
	private String modelName;
	private double currentSpeed;
	private double trimFactor;
	
	private int direction; // 1 = up, 2 = right, 3 = down, 4 = left
	private int currentY, currentX;
	
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

	@Override
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

	@Override
	public void turnLeft() {
		
		direction = 4;
		
	}

	@Override
	public void turnRight() {
		
		direction = 2;
		
	}
	
}
