package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HarmonicTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void harmonic_Pass0_ThrowIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, ()->Recursion.harmonic(0));
	}
	
	@Test
	void harmonic_PassNegative5_Negative2_2833() {
		assertEquals(-2.2833, Recursion.harmonic(-5), 0.001);
	}
	
	@Test
	void harmonic_PassPositive3_1_833() {
		assertEquals(1.833, Recursion.harmonic(3), 0.001);
	}
	
	@Test
	void harmonic_PassPositive6_2_449() {
		assertEquals(2.449, Recursion.harmonic(6), 0.001);
	}
	
	@Test
	void harmonic_PassNegative20_Negative3_5977() {
		assertEquals(-3.5977, Recursion.harmonic(-20), 0.0001);
	}
	

}
