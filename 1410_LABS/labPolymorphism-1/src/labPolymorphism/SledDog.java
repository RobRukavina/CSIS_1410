package labPolymorphism;

/**
 * Represents a SledDog object that derives from Dog
 * 
 * @author CSIS Professor
 *  
 *  */
public class SledDog extends Dog
{
	/**
	 * Constructs a new SledDog and invokes the Dog constructor
	 * to assign SledDog a breed.
	 * 
	 * @param b  breed of SledDog.
	 *  */
    public SledDog(String b)
    {
        super(b);
    }

    /** 
     * Prints the string "pulling the sled"
     * 
     * */
    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
