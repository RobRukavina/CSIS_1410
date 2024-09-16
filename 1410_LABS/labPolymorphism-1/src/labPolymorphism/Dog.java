package labPolymorphism;

/** 
 * Represents a Dog
 * 
 * @author CSIS Rob R
 * 
 * */
public class Dog
{
    private final String breed;

    /**
     * Constructs a dog
     * 
     * @param b   breed of dog
     * 
     *  */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * Prints "bark bark" to mimic how a dog communicates
     * 
     *  */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * Prints "run" to mimic how a dog moves.
     *  
     *  */
    public void move()
    {
        System.out.println("run");
    }

    /**
     * Returns the breed of the instance of Dog. 
     * 
     * */
    public String getBreed()
    {
        return breed;
    }

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + breed;
	}
    
    
}
