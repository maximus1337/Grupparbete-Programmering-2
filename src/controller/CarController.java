package controller;

import javafx.animation.AnimationTimer;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private Vehicle model;

	public CarController(CarPane cp) {

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (model != null) {
					model.move();
					cp.move(model.getCurrentX(), model.getCurrentY());
					cp.update();
				}
				
				if(model.getCurrentX() + 100 > 1200) {
					model.turnLeft();
				}
			
				if(model.getCurrentX() < 0 ) {
					model.turnRight();
				}
				
			}
			
		};
		at.start();
	}

	public void setModel(Vehicle v) {
		model = v;
	}

	public void gas(double amount) {
		model.gas(amount);
	}

	public void brake(double amount) {
		model.brake(amount);
	}

}
