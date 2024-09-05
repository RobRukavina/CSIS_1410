package unitTesting;

import java.math.BigDecimal;

public class TreasureChest {
	/**
     * Number of gold coins
     */
    private int gold;
    /**
     * Price of an ounce of gold
     */
    private static BigDecimal goldPrice = new BigDecimal(1426.90);
    /**
     * Amount of gold per coin measured in ounces
     */
    private static final BigDecimal GOLD_PER_COIN = new BigDecimal(0.9675);
    
    /**
     * illegal arg exception if goldCoins is negative
     * @param goldCoins
     */
    public TreasureChest(int goldCoins) {
        if(goldCoins < 0){
            throw new IllegalArgumentException("The number of gold coins can't be negative");
        }
        this.gold = goldCoins;
    }

    /**
     * 
     * @return gold
     */
    public int getGold(){
        return this.gold;
    }

    /**
     * 
     * @param numberOfCoins
     */
    public void addGold(int numberOfCoins){
    	 if(numberOfCoins < 0){
             throw new IllegalArgumentException("The number of gold coins can't be negative");
         }
        this.gold += numberOfCoins;
    }

    /**
     * 
     * @param numberOfCoins
     */
    public int removeGold(int numberOfCoins){
    	if(numberOfCoins < 0 || numberOfCoins > this.gold) {
    		throw new IllegalArgumentException("The number of coins to remove can't be negative or more than the amount of coins in the chest.");
    	}
        this.gold -= numberOfCoins;
        return this.gold;
    }

    /**
     * 
     * @return the price of one ounce of gold
     */
    public static BigDecimal getGoldPrice(){
        return goldPrice;
    }

    /**
     * 
     * @param goldPrice
     */
    public static void setGoldPrice(BigDecimal goldPrice){
    	if(goldPrice.compareTo(BigDecimal.ZERO) < 0) {
    		throw new IllegalArgumentException("Gold Price cannot be negative");
    	}
        TreasureChest.goldPrice = goldPrice;
    }

    /**
     * 
     * @return value in dollars
     */
    public BigDecimal valueInDollars(){
        return new BigDecimal(gold).multiply(GOLD_PER_COIN).multiply(goldPrice);

    }
    
    /**
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "[ " + this.gold +" coins ]";
    }

}
