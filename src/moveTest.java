import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import Cars.Volvo740;

public class moveTest {

	Volvo740 volvo = new Volvo740(100, null, null);

	@Test
	public void gasAndBrakeTest() {
		
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		volvo.gas(1);
		volvo.brake(0.5);
		assertEquals(.6, volvo.getCurrentSpeed(), 0);
		
	}

	@BeforeEach
	public void resetVolvo() {
		volvo.stopEngine();
		volvo.setCurrentY(0);
		volvo.setCurrentX(0);
	}
	
	
}


