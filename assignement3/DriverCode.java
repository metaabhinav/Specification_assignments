package assignment3;

import java.util.Scanner;

public class DriverCode {

	public static void main(String args[]) {
		System.out.println("Enter your choice which area you want to get return");
		System.out.println("1. Area of Triangle");
		System.out.println("2. Area of Rectangle");
		System.out.println("3. Area of Square");
		System.out.println("4. Area of Circle");
		Scanner sd = new Scanner(System.in);
		int choice=sd.nextInt();	
		Area backend = new Area();
		double output;
		if(choice==1) {
			System.out.println("Enter the width of the triangle");
			double width = sd.nextInt();
			if(width<0) {
				sd.close();
				throw new ArithmeticException("Enter the input properly");
			}
			System.out.println("Enter the height of the triangle");
			double height = sd.nextInt();	
			if(width<0) {
				sd.close();
				throw new ArithmeticException("Enter the input properly");
			}
			output = backend.triangleArea(width,height);
			System.out.println("Area of the traingle is "+output);
		}
		else if(choice==2) {
			System.out.println("Enter the width of the rectangle");
			double width = sd.nextInt();
			if(width<0) {
				sd.close();
				throw new ArithmeticException("Enter the input properly");
			}
			System.out.println("Enter the height of the rectangle");
			double height = sd.nextInt();	
			if(height<0) {
				sd.close();
				throw new ArithmeticException("Enter the input properly");
			}
			output = backend.rectangleArea(width,height);
			System.out.println("Area of the rectangle is "+output);
		}
		else if(choice==3) {
			System.out.println("Enter the width of the square");
			double width = sd.nextInt();
			if(width<0) {
				sd.close();
				throw new ArithmeticException("Enter the input properly");
			}
			output = backend.squareArea(width);
			System.out.println("Area of the square is "+output);
		}
		else if(choice==4) {
			System.out.println("Enter the radius of the square");
			double radius = sd.nextInt();
			if(radius<0) {
				sd.close();
				throw new ArithmeticException("Enter the input properly");
			}
			output = backend.circleArea(radius);
			System.out.println("Area of the circle is "+output);
		}
		else {
			System.out.println("Wrong Input");
		}
		sd.close();
		
	}
}
