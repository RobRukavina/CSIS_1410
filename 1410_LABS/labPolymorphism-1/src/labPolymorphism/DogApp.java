package labPolymorphism;

public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog.getClass().getSimpleName() + ": " + myDog.getBreed());
        actAsDog(myDog);
        
        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog.getClass().getSimpleName() + ": " + mySledDog.getBreed());
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog.getClass().getSimpleName() + ": " + myCircusDog.getBreed());
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array:");
        
        Dog[] dogs = { myDog, mySledDog, myCircusDog };
        
        for(Dog d : dogs){
        	System.out.println(d.toString());

        	if(d instanceof SledDog) {
        		((SledDog) d).pullSled();
        	}
        	
        	actAsDog(d);
        }
    
    }

    /** 
     * Invokes both the communicate and move methods of a dog
     * then prints a new line.
     * 
     * */
    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
