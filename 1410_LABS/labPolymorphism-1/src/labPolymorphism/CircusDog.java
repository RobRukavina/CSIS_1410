package labPolymorphism;

/**
 * Represents a CircusDog object that derives from Dog
 * 
 * @author CSIS Professor
 *  
 *  */
public class CircusDog extends Dog
{
	/**
	 * Constructs a new CircusDog and invokes the Dog constructor
	 * to assign CircusDog a breed.
	 * 
	 * @param b  breed of CircusDog.
	 *  
	 *  */
    public CircusDog(String b)
    {
        super(b);
    }

    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
}
