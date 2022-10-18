package assignment2;
import java.util.*;
public class DriverCode {
	
public static void main(String args[]) {
	Scanner sd = new Scanner(System.in);
	System.out.println("Enter the number of the students you want to enter");
	int totStudent = sd.nextInt();
	int[] studentMarks= new int[totStudent];
	for(int iterator=0; iterator < totStudent; iterator++) {
		System.out.print("Enter marks of "+(iterator+1)+" student : ");
		studentMarks[iterator] = sd.nextInt();
		if(studentMarks[iterator] < 0 || studentMarks[iterator]  > 100) {
			sd.close();
			throw new ArithmeticException("Enter the marks properly");
			}
	}
	sd.close();
	Marksheet operation = new Marksheet();
	System.out.println("");
	System.out.printf("Average of all the marks is %.2f ",operation.averageStudent(studentMarks));
	System.out.println("");
	System.out.println("Maximum of all the marks is "+operation.maxMarkStudent(studentMarks));
	System.out.println("Minimum of all the marks is "+operation.minMarkStudent(studentMarks));
	System.out.printf("Percentage of Pass Students are %.2f ",operation.passPercentage(studentMarks));
	
}
}
