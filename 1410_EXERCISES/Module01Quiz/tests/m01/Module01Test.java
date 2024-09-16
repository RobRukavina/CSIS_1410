package m01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Module01Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void transform_EmptyString_EmptyString() {
		assertEquals("", Module01.transform(""));
	}
	
	@Test
	void transform_ThisStringSaysThat_ThisStringSaysThat() {
		assertEquals("ThisStringSaysThat", Module01.transform("ThisStringSaysThat"));
	}
	
	@Test
	void methodA_Hello_ThereHHH_hellotherehhhhhherehtolleh() {
		assertEquals("hellotherehhhhhherehtolleh", Module01.methodA("Hello_ThereHHH"));
	}
	
	@Test
	void methodA_zeroZebras_ZerozebrassarbexoreZ() {
		assertEquals("ZerozebrassarbezoreZ", Module01.methodA("zeroZebras"));
	}
	
	@Test
	void methodA_applesrgud_ApplesrguddugrselppA() {
		assertEquals("ApplesrguddugrselppA", Module01.methodA("applesrgud"));
	}

	@Test
	void methodA_FourUnderscores_EmptyString() {
		assertEquals("", Module01.methodA("____"));
	}
	
	@Test
	void methodA_EmptyString_EmptyString() {
		assertEquals("", Module01.methodA(""));
	}
	
	@Test
	void methodA_NullAsString_ActualNull() {
		assertEquals(null, Module01.methodA("Null"));
	}
	
	@Test
	void methodB_EmptyString_Zero() {
		assertEquals(0, Module01.methodB(""));
	}
	
	@Test
	void methodB_i_One() {
		assertEquals(1, Module01.methodB("i"));
	}
	
	@Test
	void methodB_hi_Two() {
		assertEquals(2, Module01.methodB("hi"));
	}
	
	@Test
	void methodB_Heu_Two() {
		assertEquals(2, Module01.methodB("Heu"));
	}
	
	@Test
	void methodB_rauh_Three() {
		assertEquals(3, Module01.methodB("rauh"));
	}
	
	@Test
	void methodB_Hund_Four() {
		assertEquals(4, Module01.methodB("Hund"));
	}
	
	@Test
	void methodB_maehen_Five() {
		assertEquals(5, Module01.methodB("maehen"));
	}
	
	@Test
	void methodB_Moehren_Six() {
		assertEquals(6, Module01.methodB("Moehren"));
	}
	
	@Test
	void methodB_Ueber_Four() {
		assertEquals(4, Module01.methodB("Ueber"));
	}
	
	@Test
	void methodB_Freundlich_Nine() {
		assertEquals(9, Module01.methodB("Freundlich"));
	}
}
