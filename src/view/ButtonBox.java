package view;

import controller.CarController;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ButtonBox extends HBox {

	private CarController controller;
	private Spinner<Integer> spinner;
	private Button gasButton;
	private Button brakeButton;
	
	private Button turboOnButton;
	private Button turboOffButton;
	
	private Button flatbedDownButton;
	private Button flatbedUpButton;
	private Text flatbedText;
	private double flatbedAngle = 0;

	public ButtonBox(CarController cc) {
		this.controller = cc;
		setContainerStyle();
		setTurboStyle();
		addComponents();
		addEventListeners();
	}

	private void addEventListeners() {
		gasButton.setOnAction(e -> { // All cars
			controller.gas(spinner.getValue() / 100.0);
		});
	
		brakeButton.setOnAction(e -> { // All cars
			controller.brake(spinner.getValue() / 100.0);
		});
		
		turboOnButton.setOnAction(e -> { // Saab turbo on
			controller.turboOn();
		});
		
		turboOffButton.setOnAction(e -> { // Saab turbo off
			controller.turboOff();
		});
		
		flatbedDownButton.setOnAction(e -> { // Scania raise flatbed
			updateFlatbedAngle();
			controller.raiseFlatbed();
		});
		
		flatbedUpButton.setOnAction(e -> { // Scania lower flatbed
			updateFlatbedAngle();
			controller.lowerFlatbed();
			
		});
		
	}

	private void addComponents() {
		/* Gas and break */
		VBox container = new VBox();
		HBox spinnerBox = new HBox();
		HBox buttonsBox = new HBox();

		spinner = new Spinner<Integer>(0, 100, 50);
		spinner.setEditable(true);

		gasButton = new Button("Gas");
		gasButton.setPrefSize(100, 20);

		brakeButton = new Button("Brake");
		brakeButton.setPrefSize(100, 20);

		spinnerBox.getChildren().addAll(spinner);
		buttonsBox.getChildren().addAll(gasButton, brakeButton);
		container.getChildren().addAll(spinnerBox, buttonsBox);

		this.getChildren().addAll(container);
		
		/* Saab turbo */
		
		VBox saabTurbo = new VBox();
		HBox saabButtonBox = new HBox();
		
		turboOnButton = new Button("Turbo On");
		turboOffButton = new Button("Turbo Off");
		
		saabButtonBox.getChildren().addAll(turboOnButton, turboOffButton);
		saabTurbo.getChildren().addAll(saabButtonBox);
		
		this.getChildren().addAll(saabTurbo);
		
		/* Scania trailer */
		
		VBox scaniaTrailer = new VBox();
		HBox scaniaTrailerButtonBox = new HBox();
		
		flatbedDownButton = new Button("Lower flatbed");
		flatbedUpButton = new Button("Raise flatbed");
		flatbedText = new Text("Angle: " + flatbedAngle);
		
		scaniaTrailerButtonBox.getChildren().addAll(flatbedDownButton,flatbedUpButton,flatbedText);
		scaniaTrailer.getChildren().addAll(scaniaTrailerButtonBox);
		
		this.getChildren().addAll(scaniaTrailer);
		
	}

	private void setContainerStyle() {
		
		this.setPadding(new Insets(15, 12, 15, 12));
		this.setSpacing(10);
		this.setStyle("-fx-background-color: #336699;");
		
	}
	
	private void setTurboStyle() {

		this.setPadding(new Insets(15, 12, 15, 12));
		this.setSpacing(10);
		this.setStyle("-fx-background-color: #336699;");
		
	}
	
	private void updateFlatbedAngle() {
		
		flatbedAngle = controller.getScaniaAngle();
		
	}

}
