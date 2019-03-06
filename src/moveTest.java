import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import Cars.Volvo740;

public class moveTest {

	Volvo740 volvo = new Volvo740(100, null, null, 1.25);

	@Test
	public void gasAndBrakeTest() {
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		volvo.gas(1);
		volvo.brake(0.5);
		assertEquals(.625, volvo.getCurrentSpeed(), 0);
		volvo.brake(.5);
		volvo.gas(1);
		
	}

	@BeforeEach
	public void resetVolvo() {
		volvo.stopEngine();
		volvo.setCurrentY(0);
		volvo.setCurrentX(0);
	}
	
	@Test
	public void move() {
		assertEquals(0, volvo.getCurrentX(), 0);
		assertEquals(0, volvo.getCurrentY(), 0);
		
		volvo.turnRight();
		volvo.gas(1);
		volvo.move();
		volvo.move();
		assertEquals(2.5, volvo.getCurrentX(), 0);
		assertEquals(0, volvo.getCurrentY(), 0);
		
	}

}


