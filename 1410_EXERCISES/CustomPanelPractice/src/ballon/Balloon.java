/**
 * 
 */
package ballon;

import java.util.Objects;

/**
 * Represents a balloon object
 * 
 */
public class Balloon {
	private BalloonSize size;
	private BalloonType type;
	
	/**
	 * 
	 */
	public Balloon(BalloonSize size, BalloonType type) {
		this.size = size;
		this.type = type;
	}
	
	public BalloonSize getSize() {
		return size;
	}

	public BalloonType getType() {
		return type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Balloon)) {
			return false;
		}
		Balloon other = (Balloon) obj;
		return size == other.size && type == other.type;
	}

	@Override
	public String toString() {
		return size + " " + type;
	}

	
}
