package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import model.Saab95;
import model.Scania;
import model.Transport;
import model.Volvo740;

public class testing {

	Volvo740 volvo = new Volvo740(100, null, null);
	Saab95 saab = new Saab95(100, null, null);
	Scania scania = new Scania(100, null, null);
	Transport transport = new Transport(100, null, null);

	@Test
	public void gasAndBrakeTest() {
		 
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		volvo.gas(1);
		assertEquals(1.2, volvo.getCurrentSpeed(),0);
		volvo.brake(0.5);
		assertEquals(.6, volvo.getCurrentSpeed(), 0);
		
	}

	@BeforeEach
	public void resetVolvo() {
		volvo.stopEngine();
		volvo.setCurrentY(0);
		volvo.setCurrentX(0);
	}
	
	@Test
	public void moveTest() {
		
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		volvo.gas(1);
		volvo.move();
		assertEquals(1.2, volvo.getCurrentX(), 0);
		volvo.turnLeft();
		volvo.move();
		assertEquals(0, volvo.getCurrentX(), 0);
		volvo.move();
		assertEquals(-1.2, volvo.getCurrentX(), 0);
		
	}
	
	@Test
	public void testMaxSpeed() {
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		for (int i = 0; i < 1000; i++) { 
			volvo.gas(1);
		}
		assertEquals(100, volvo.getCurrentSpeed(), 0);
	}
	
	@Test
	public void negativeVelocityTest() {
		
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		
		for (int i = 0; i < 100; i++) {
			volvo.gas(-1);
		}
		
		assertEquals(0, volvo.getCurrentSpeed() ,0);
		
	}
	
	@Test
	public void testSaabTurbo() {
		
		assertEquals(0, saab.getCurrentSpeed(), 0);
		
		saab.gas(1);
		assertEquals(1, saab.getCurrentSpeed(), 0);
		saab.setTurboOn();
		saab.gas(1);
		assertEquals(2.3, saab.getCurrentSpeed(), 0);
		
	}
	
	@Test 
	public void scaniaTest() {
		
		assertEquals(0, scania.getAngle(), 0);
		
		scania.liftDown(-300);
		assertEquals(0, scania.getAngle(), 0);
		scania.liftUp(100);
		assertEquals(70, scania.getAngle(), 0);
		scania.liftUp(-30);
		scania.liftUp(30);
		assertEquals(30, scania.getAngle(), 0);
		scania.liftDown(30);
		assertEquals(0, scania.getAngle(), 0);
		scania.gas(1);
		scania.liftUp(30);
		assertEquals(0, scania.getAngle(), 0);
		scania.brake(1);
		scania.liftUp(50);
		assertEquals(50, scania.getAngle(), 0);
		
	}
	
	@Test
	public void transportTest() {
		
		transport.gas(1);
		assertEquals(1.1, transport.getCurrentSpeed(), 0);
		
		
	}
	
	
}


