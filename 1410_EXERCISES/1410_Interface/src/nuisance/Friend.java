package nuisance;

/**
 * Represents a Friend object which is a subclass to Person
 * 
 * @author Rob R.
 */
public class Friend extends Person {
	private Hobby hobby;
	
	/**
	 * Constructs the Friend object by calling superclass constructor.
	 * 
	 * @param name
	 * @param age
	 * @param hobby
	 */
	public Friend(String name, int age, Hobby hobby) {
		super(name, age);
		this.hobby = hobby;
	}
	
	/**
	 * Returns a string in the format of "{name} is chilling"
	 * 
	 * @return string
	 */
	public String chill() {
		return super.getName() + "is chilling";
	}

	/**
	 * Loops through an array of Friends passed and returns a different string
	 * based on the number of friends in the array.
	 * 
	 * @param friends (Friend[])
	 * @return string
	 */
	public String play(Friend[] friends) {
		StringBuilder sb = new StringBuilder();
		sb.append("playing " + this.hobby);
		
		if(friends.length > 0) {
			int idx = 0;
			for(Friend f : friends) {
				if(idx == 0 && idx == friends.length - 1) {
					sb.append(" with " + f.getName() + ".");
				} if(idx > 0 && idx == friends.length - 1){
					sb.append(", and " + f.getName() + ".");
				}else {
					sb.append(", " + f.getName());
				}
				idx++;
			}
		}
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return super.toString() + this.hobby;
	}
	
	
}
