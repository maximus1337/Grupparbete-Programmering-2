import Boats.Ferry;
import Cars.Saab95;
import Cars.Scania;
import Cars.ToyotaYaris;
import Cars.Volvo740;
import Vehicles.Transport;
import Vehicles.Vehicle;
import javafx.scene.paint.Color;

public class main {

	public static void main(String[] args) {
		
		Transport t = new Transport(400,Color.BLACK,"Transport",1.25);
		Ferry f = new Ferry(20000,Color.ORANGE,"Ferry");
		
		Volvo740 v = new Volvo740(400,Color.BLACK, "Volo",1.1);
		Saab95 s = new Saab95(300,Color.BLACK,"Saab",1.1);
		
		t.addCar(v);
		t.addCar(s);
		
		f.addCar(v);
		f.addCar(s);
		
		f.removeCar();
		
		System.out.println(f.getCars());
		
		
	}
	
}
