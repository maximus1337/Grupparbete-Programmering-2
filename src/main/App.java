package main;

import controller.CarController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Saab95;
import model.Scania;
import model.Vehicle;
import model.Volvo740;
import view.ButtonBox;
import view.CarPane;

public class App extends Application {

	private final static double WIDTH = 1200;
	private final static double HEIGHT = 700;

	@Override
	public void start(Stage primaryStage) throws Exception {

		CarPane cp = new CarPane();

		CarController cc = new CarController(cp);

		Vehicle volvo = new Volvo740(175, Color.BLACK, "Volvo");
		Vehicle scania = new Scania(500, Color.BLACK, "Scania");
		Vehicle saab = new Saab95(100, Color.GREEN, "Saab");
		
		cc.addModel(scania);
		cc.addModel(saab);
		cc.addModel(volvo);
		
		scania.setCurrentY(100);
		saab.setCurrentY(200);
		
		ButtonBox cbp = new ButtonBox(cc);

		BorderPane root = new BorderPane();

		root.setTop(cp);
		root.setBottom(cbp);
		
		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Car Simulator");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}
