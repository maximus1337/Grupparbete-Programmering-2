import javafx.scene.paint.Color;

public class main {

	public static void main(String[] args) {
		
		Transport t = new Transport(0, null, null, 0);
		
		Volvo740 v = new Volvo740(100, null, null, 1.25);
		v.setCurrentX(0);
		v.setCurrentY(0);
		
		v.gas(1);
		v.turnRight();
		v.move();
		v.move();
		v.move();
		v.move();
		v.turnLeft();
		
		System.out.println(v.getCurrentX());
		
	}
	
}
