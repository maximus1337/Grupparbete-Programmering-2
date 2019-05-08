package controller;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import model.Saab95;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private ArrayList<Vehicle> models = new ArrayList<Vehicle>();

	public CarController(CarPane cp) {

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				
				for (Vehicle model : models) {
					if (model != null) {
						model.move();
						cp.move(model.getCurrentX(), model.getCurrentY());
						cp.update(model);
					}
					
					if(model.getCurrentX() + 100 > 1200) {
						model.turnLeft();
					}
				
					if(model.getCurrentX() < 0 ) {
						model.turnRight();
					}
				}
				
			}
			
		};
		at.start();
	}

	public void addModel(Vehicle v) {
		 models.add(v);
	}

	public void gas(double amount) {
		for (Vehicle model : models) {
			model.gas(amount);
		}
	}

	public void brake(double amount) {
		for (Vehicle model : models) {
			model.brake(amount);
		}
	}
	
	public void turboOn() {
		for(Vehicle model : models) {
			if(model instanceof Saab95) {
				((Saab95) model).setTurboOn();
			}
		}
	}
	
	public void turboOff() {
		for(Vehicle model : models) {
			if(model instanceof Saab95) {
				((Saab95) model).setTurboOn();
			}
		}
	}

}
