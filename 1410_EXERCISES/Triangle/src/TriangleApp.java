/*************************************************** 
* Name: Margret Posch
* Assignment: Triangle
*
* TriangleApp is a test client for class Triangle.
* No changes should be made to this class.
***************************************************/

public class TriangleApp
{
	public static void main(String[] args)
	{
		double[] side1Values = {3.0, 5.0, 4.0, 4.5, 0.0, 4.0, -2.0, 1.0, 3.1};
		double[] side2Values = {5.0, 4.0, 3.0, 4.5, 0.0, 4.0,  2.0, 2.0, 2.1};
		double[] side3Values = {4.0, 3.0, 5.0, 4.5, 0.0, 5.0,  1.0, 3.0, 0.0};
      int numberOfTests = side1Values.length;
      
      for(int i = 0; i < numberOfTests; i++) {
         Triangle triangle = 
            new Triangle(side1Values[i], side2Values[i], side3Values[i]);
         testTriangle(triangle);
      }
	}
   
   private static void testTriangle(Triangle t) {
		System.out.printf("Triangle (%.1f, %.1f, %.1f) ",
         t.getSide1(), t.getSide2(), t.getSide3());
      System.out.print(t.isEquilateral() ? "is equilateral" : "");
      System.out.print(t.isRight() ? "is right" : "");
      System.out.println();
   }
}