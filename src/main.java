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
		
		Transport t = new Transport(100,Color.BLACK,"Transport");
		Ferry f = new Ferry(20000,Color.ORANGE,"Ferry");
		Scania sc = new Scania(100,null, null);
		
		Volvo740 v = new Volvo740(100,Color.BLACK, "Volo");
		Saab95 s = new Saab95(300,Color.BLACK,"Saab");
		
		
		
	}
	
}
