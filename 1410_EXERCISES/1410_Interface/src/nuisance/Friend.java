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
		return super.getName() + " is chilling";
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
		sb.append("playing " + this.hobby.toString());
		
		if(friends.length > 0) {
			for(int i = 0; i < friends.length; i++) {
				Friend f = friends[i];
				if(i == 0) {
					if(friends.length == 1) {
						sb.append(" with " + f.getName() + ".");
					} else if(friends.length > 1) {
						sb.append(" with " + f.getName());
					} else {
						sb.append(" with " + f.getName());
					}
				} else {
					if(i != friends.length - 1){
						sb.append(", " + f.getName());
					}
					if(i == friends.length - 1 && friends.length > 2) {
						sb.append(", and " + f.getName() + ".");
					} else if(i== friends.length - 1 && friends.length == 2) {
						sb.append(" and " + f.getName() + ".");
					}
				}
			}
		}
		
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Friend)) {
			return false;
		}
		
		Friend other = (Friend) obj;
		
		return hobby == other.hobby;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.hobby;
	}
	
	
}
