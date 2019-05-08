package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import model.Saab95;
import model.Scania;
import model.Vehicle;
import model.Volvo740;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private ImageView scaniaImage;
	private ImageView saabImage;
	private double xPos;
	private double yPos;

	public CarPane() {
		
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		this.getChildren().add(volvoImage);
		
		scaniaImage = new ImageView(new Image("/pics/Scania.jpg"));
		this.getChildren().add(scaniaImage);
		
		saabImage = new ImageView(new Image("/pics/Saab95.jpg"));
		this.getChildren().add(saabImage);
		
	}

	public void move(double x, double y) {
		
		
		this.xPos = x;
		this.yPos = y;
		
	}
	
	public void updateVolvo() {
		volvoImage.setX(xPos);
		volvoImage.setTranslateY(yPos);
	}
	
	public void updateScania() {
		scaniaImage.setX(xPos);
		scaniaImage.setTranslateY(yPos);
	}
	
	public void updateSaab() {
		saabImage.setX(xPos);
		saabImage.setTranslateY(yPos);
	}

	public void update(Vehicle m) {
		if(m instanceof Volvo740) {
			updateVolvo();
		}
		else if(m instanceof Saab95) {
			updateSaab();
		}
		else if(m instanceof Scania) {
			updateScania();
		}
	}

}
