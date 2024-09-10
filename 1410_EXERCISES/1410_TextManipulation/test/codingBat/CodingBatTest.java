package codingBat;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CodingBatTest {

	@Test
	void wordEnds_Args_abcXY123XYijk_XY_Returns_c13i() {
		assertEquals("c13i", CodingBat.wordEnds("abcXY123XYijk","XY"));
	}
	
	@Test
	void wordEnds_Args_XY123XY_XY_Returns_13() {
		assertEquals("13", CodingBat.wordEnds("XY123XY","XY"));
	}
	
	@Test
	void wordEnds_Args_XY1XY_XY_Returns_11() {
		assertEquals("11", CodingBat.wordEnds("XY1XY","XY"));
	}
	
	@Test
	void wordEnds_Args_XYXY_XY_Returns_XY() {
		assertEquals("XY", CodingBat.wordEnds("XYXY","XY"));
	}
	
	@Test
	void wordEnds_Args_XY_XY_ReturnsEmptyString() {
		assertEquals("", CodingBat.wordEnds("XY","XY"));
	}
	
	@Test
	void testWwordEnds_Args_Hi_XY_ReturnsEmptyString() {
		assertEquals("", CodingBat.wordEnds("Hi","XY"));
	}
	
	@Test
	void wordEnds_Args_EmptyString_XY_ReturnsEmptyString() {
		assertEquals("", CodingBat.wordEnds("","XY"));
	}
	
	@Test
	void wordEnds_Args_abc1xyz1i1j_1_Returns_cxziij() {
		assertEquals("cxziij", CodingBat.wordEnds("abc1xyz1i1j","1"));
	}
	
	@Test
	void wordEnds_Args_abc1xyz1_1_Returns_cxz() {
		assertEquals("cxz", CodingBat.wordEnds("abc1xyz1","1"));
	}
	
	@Test
	void wordEnds_Args_abc1xyz11_1_Returns_cxz11() {
		assertEquals("cxz11", CodingBat.wordEnds("abc1xyz11","1"));
	}
	
	@Test
	void wordEnds_Args_abc1xyz1abc_abc_Returns_11() {
		assertEquals("11", CodingBat.wordEnds("abc1xyz1abc","abc"));
	}
	
	@Test
	void wordEnds_Args_abc1xyz1abc_b_Returns_acac() {
		assertEquals("acac", CodingBat.wordEnds("abc1xyz1abc","b"));
	}
	
	@Test
	void wordEnds_Args_abc1abc1abc_abc_Returns_1111() {
		assertEquals("1111", CodingBat.wordEnds("abc1abc1abc","abc"));
	}
}
