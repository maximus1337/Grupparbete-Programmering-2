import javafx.scene.paint.Color;

public class main {

	public static void main(String[] args) {
		
		Volvo740 volvo = new Volvo740(100, Color.BLACK, "Volvo", 1.25);
		Saab95 saab = new Saab95(100, Color.WHITE, "Volvo", 1.12);
		
		System.out.println(volvo.getEnginePower());
		System.out.println(saab.getColor());
		
		
	}
	
}
