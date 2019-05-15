import javafx.scene.paint.Color;
import model.Ferry;
import model.Saab95;
import model.Scania;
import model.ToyotaYaris;
import model.Transport;
import model.Vehicle;
import model.Volvo740;

public class main {

	public static void main(String[] args) {
		
		Transport t = new Transport(100,Color.BLACK,"Transport");
		Ferry f = new Ferry(20000,Color.ORANGE,"Ferry");
		Scania sc = new Scania(100,null, null);
		
		Volvo740 v = new Volvo740(100,Color.BLACK, "Volo");
		Saab95 s = new Saab95(300,Color.BLACK,"Saab");
		
		sc.liftDown(70);
		System.out.println(sc.getAngle());
		
	}
	
}
