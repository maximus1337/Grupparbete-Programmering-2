import java.util.ArrayList;

public class Transporttrailer {
	
	private int lift = 0; // 0 = lift it down, 1 = list is up
	
	public ArrayList<Car> cars = new ArrayList<Car>();
	private int carsTail = cars.size();
	
	public Transporttrailer() {
		
	}
	
	/**
	 * Lifts up the lift of the trailer.
	 */
	public void liftUp() {
		
		lift = 1;
		
	}
	
	/**
	 * Lifts down the lift of the trailer.
	 */
	public void liftDown() {
		
		lift = 0;
		
	}
	
	/**
	 * Returns true if the lift is up, and returns false if the lift is down.
	 * @return boolean
	 */
	public boolean isLiftUp() {
		
		if(lift == 1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * Adds a car to the trailer.
	 * @param Car c
	 */
	public void addCar(Car c) {
		
		if(cars.size() > 10 || lift == 1 || c instanceof Transport) {
			return;
		}
		else {
			cars.add(c);
		}
		
	}
	
	/**
	 * Removes a car from the trailer.
	 * @param c
	 */
	public void removeCar() {
		
		if(lift == 0) {
			cars.remove(0);
		}
		else {
			return;
		}
		
	}
	
	/**
	 * Return the car in the index x
	 * @param int x
	 * @return Car
	 */
	public Car getCar(int x) {
		
		if(x > carsTail) {
			
			return null;
			
		}
		
		else {
			
			return cars.get(x);
			
		}
		
	}
	
	public int getCarsSize() {
		
		return carsTail;
		
	}
	
}




