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
	void harmonic_PassNegative1_() {
		fail("Not yet implemented");
	}
//	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	

}
