import Boats.Ferry;
import Cars.Saab95;
import Cars.ToyotaYaris;
import Cars.Volvo740;
import Vehicles.Transport;
import Vehicles.Vehicle;
import javafx.scene.paint.Color;

public class main {

	public static void main(String[] args) {
		
		Ferry f = new Ferry(100, Color.BLACK, "Ferry");
		
		Volvo740 volvo = new Volvo740(100,Color.BLACK, "740", 1.1);
		Saab95 volvo1 = new Saab95(100,Color.BLACK, "740", 1.1);
		ToyotaYaris volvo2 = new ToyotaYaris(100,Color.BLACK, "740", 1.1);
		Volvo740 volvo3 = new Volvo740(100,Color.BLACK, "740", 1.1);
		
		f.addCar(volvo);
		f.addCar(volvo1);
		f.addCar(volvo2);
		f.addCar(volvo3);
		
		
		
		System.out.println(f.getCar(0));
		
	}
	
}
