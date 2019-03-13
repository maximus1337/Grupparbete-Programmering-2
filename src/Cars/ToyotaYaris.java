package Cars;
import Vehicles.Car;
import javafx.scene.paint.Color;

public class ToyotaYaris extends Car{

	private static final double trimFactor = 1.1;
	
	public ToyotaYaris(double ep, Color c, String mn) {
		super(ep, c, mn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double speedFactor() {
		// TODO Auto-generated method stub
		return getEnginePower() * 0.1 * trimFactor;
	}

}
