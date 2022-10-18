package assignment3;

/**
 * @author Abhinav
 * @version 1.0
 * @since 17/10/2022
 * this class contians method to get area of triangle, circle, rectangle, square
 */
public class Area {
	
	/** this method get the area of the triangle
	 * @param width takes a double type input
	 * @param height takes a double type input
	 * @return the area of the traingle as double
	 */
	double triangleArea(double width, double height) {
		double output;
		try {
		output=0.5*width*height;
		return output;}
		catch(ArithmeticException e) {
			System.out.println("Error");
			return 0;
		}
	}
	/** this method get the area of the rectangle
	 * @param width takes a double type input
	 * @param height takes a double type input
	 * @return the area of the rectangle as double
	 */
	double rectangleArea(double width, double height) {
		double output;
		try {
		output=width*height;
		return output;}
		catch(ArithmeticException e) {
			System.out.println("Error");
			return 0;
		}
	}
	/**this method get the area of the square
	 * @param width takes a double type input
	 * @return the area of the square as double
	 */
	double squareArea(double width) {
		double output;
		try {
		output=width*width;
		return output;}
		catch(ArithmeticException e) {
			System.out.println("Error");
			return 0;
		}
	}
	
	/**this method get the area of the circle
	 * @param radius takes a double type input
	 * @return the area of the circle as double
	 */
	double circleArea(double radius) {
		double output;
		try {
		output=3.14*radius*radius;
		return output;}
		catch(ArithmeticException e) {
			System.out.println("Error");
			return 0;
		}
	}
}
