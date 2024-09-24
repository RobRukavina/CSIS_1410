package phones;

import java.text.DecimalFormat;

/**
 * Represents dimensions of a phone
 * 
 * @author Rob R
 */
public class Dimension {
	private double height;
	private double width;
	private double depth;
	
	/** 
	 * Constructs the Dimensions class.
	 * Throws illegal argument exception if any params are 0 or less.
	 * 
	 * @param height
	 * @param width
	 * @param depth
	 */
	public Dimension(double height, double width, double depth) {
		if(height <= 0 || width <= 0 || depth <= 0) {
			throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");			
		} else {
			this.height = height;
			this.width = width;
			this.depth = depth;
		}		
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return this.height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return this.width;
	}

	/**
	 * @return the depth
	 */
	public double getDepth() {
		return this.depth;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.0");
		// if(!df.format(height).endsWith("0"))
		return "(" + df.format(height) + " x " + df.format(width) + " x " + df.format(depth) + ")";
	}
	
	
}
