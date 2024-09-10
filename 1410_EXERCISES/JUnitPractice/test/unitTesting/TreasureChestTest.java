package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreasureChestTest {
	private TreasureChest treasure;
	private TreasureChest emptyChest;
	private final BigDecimal DELTA = new BigDecimal(0.000001);  
	@BeforeEach
	void setUp() throws Exception {
		treasure = new TreasureChest(10);
		emptyChest = new TreasureChest(0);
		TreasureChest.setGoldPrice(new BigDecimal(1426.90));
	}

	@Test
	void treasureChest_PositiveNumberOfCoins_AllCoinsStoredInTreasureChest() {
		TreasureChest treasure7 = new TreasureChest(7);
		assertEquals(7, treasure7.getGold());
	}
	
	@Test
	void treasureChest_ZeroCoins_NoCoinsStoredInTreasureChest() {
		TreasureChest treasure0 = new TreasureChest(0);
		assertEquals(0, treasure0.getGold());
	}
	
	@Test
	void treasureChest_NegativeNumberOfCoins_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, ()->{new TreasureChest(-2);});
	}

	@Test
	void addGold_AddingPositiveNumberOfCoins_AddsToNumberOfGoldCoins() {
		TreasureChest treasure10 = new TreasureChest(10);
		treasure10.addGold(2);
		int expected = 12;
		int actual = treasure10.getGold();
		assertEquals(expected, actual);
	}
	
	@Test
	void addGold_ZeroCoinsAdded_NumberOfCoinsInTreasureChestIsUnchanged() {
		TreasureChest treasure10 = new TreasureChest(10);
		treasure10.addGold(0);
		int expected = 10;
		int actual = treasure10.getGold();
		assertEquals(expected, actual);
	}
	
	@Test
	void addGold_AddingNegativeNumberOfCoins_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, ()->{new TreasureChest(-2);});
	}

	@Test
	void testRemoveGold() {
		fail("Not yet implemented");
	}

	@Test
	void setGoldPrice_PositiveBigDecimal_SetsThePriceOfGoldForTreasureChest() {
		TreasureChest.setGoldPrice(new BigDecimal(0.9675));
		assertEquals(new BigDecimal(0.9675), TreasureChest.getGoldPrice());
	}
	
	@Test
	void setGoldPrice_ZeroBigDecimal_SetsThePriceOfGoldForTreasureChest() {
		TreasureChest.setGoldPrice(BigDecimal.ZERO);
		assertEquals(BigDecimal.ZERO, TreasureChest.getGoldPrice());
	}
	
	@Test
	void setGoldPrice_NegativeBigDecimal_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, ()->{ TreasureChest.setGoldPrice(new BigDecimal(-0.9675));});
	}

	@Test
	void testValueInDollars() {
		BigDecimal diff = new BigDecimal(1380.2575).subtract(treasure.valueInDollars()).abs();
		assertTrue(!(diff.compareTo(DELTA) > 1));
	}

	@Test
	void toString_PositiveNumberOfCoins_ReturnNumberOfCoinsInBrackets() {
		String expected = "[ 10 coins ]";
		String actual = treasure.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	void toString_NoCoins_Return0CoinsInBrackets() {
		String expected = "[ 0 coins ]";
		String actual = emptyChest.toString();
		assertEquals(expected, actual);
	}

}
