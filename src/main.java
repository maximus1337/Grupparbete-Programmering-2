import Boats.Ferry;
import Cars.Volvo740;
import Vehicles.Transport;
import javafx.scene.paint.Color;

public class main {

	public static void main(String[] args) {
		
		Ferry f = new Ferry(100, Color.BLACK, "Ferry");
		Volvo740 volvo = new Volvo740(100,Color.BLACK, "740", 1.1);
		
		f.addCar(volvo);
		
		System.out.println(f.getCar(0));
		
	}
	
}
