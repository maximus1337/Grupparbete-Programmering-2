package view;

import controller.CarController;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ButtonBox extends HBox {

	private CarController controller;
	private Spinner<Integer> spinner;
	private Button gasButton;
	private Button brakeButton;
	
	private Button turboOnButton;
	private Button turboOffButton;
	
	private Button trailerDownButton;
	private Button trailerUpButton;

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
		
		trailerDownButton = new Button("Lower trailer");
		trailerUpButton = new Button("Raise trailer");
		
		scaniaTrailerButtonBox.getChildren().addAll(trailerDownButton,trailerUpButton);
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

}
