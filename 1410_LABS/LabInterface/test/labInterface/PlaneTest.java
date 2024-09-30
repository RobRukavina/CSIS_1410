package labInterface;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PlaneTest {
	private static ByteArrayOutputStream message;
	private static PrintStream consoleOutput;
	private Plane plane = new Plane(4, "B1-Lancer");
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		consoleOutput = System.out;
		message = new ByteArrayOutputStream();
		PrintStream newOutput = new PrintStream(message);
		System.setOut(newOutput);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.setOut(consoleOutput);
	}

	@Test
	void toString_ReturnsString_B1dashLancer_with_4_engines() {
		assertEquals(plane.toString(), "B1-Lancer with 4 engines");
	}

	@Test
	void launch_validatePrintedMessage() {
		plane.launch();
		
		String expected = "Rolling until take-off" + System.lineSeparator();
		String actual = message.toString();
		
		assertEquals(expected, actual);
		
		message.reset();
	}

	@Test
	void land_validatePrintedMessage() {
		plane.land();
		
		String expected = "Rolling to a stop" + System.lineSeparator();
		String actual = message.toString();
		
		assertEquals(expected, actual);
		
		message.reset();
	}

}
