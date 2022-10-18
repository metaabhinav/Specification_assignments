package assignment2;

/**
 * @author Abhinav
 *@version 1.0
 *@since 17/10.2022
 *this class contains method that gives average student,maximum mark, minimum mark, pass percentage in a class
 */
public class Marksheet {

	/**average student method provide the average marks from the array
	 * @param classMarks that is an array that contains marks of the student
	 * @return average marks of the class
	 */
	float averageStudent(int[] classMarks) {
		float average;
		float sum = 0;
		try {
		for(int iterator = 0; iterator < classMarks.length; iterator++) {
			sum = sum+classMarks[iterator];
		}
		average=sum/classMarks.length;
		return average;}
		catch(ArithmeticException e) {
			System.out.print("There is an error ");
			return 0;
		}
	}
	
	/**
	 * maxMarkStudent provides the maximum marks in the array
	 * @param classMarks that is an array that contains marks of the student
	 * @return maximum marks in the array
	 */
	int maxMarkStudent(int[] classMarks) {
		int max = Integer.MIN_VALUE;
		for(int iterator = 0; iterator < classMarks.length; iterator++) {
			if(max < classMarks[iterator])
				max = classMarks[iterator];
		}
		return max;
	}
	/**minMarkStudent provides the minimum marks in the array
	 * @param classMarks that is an array that contains marks of the student
	 * @return minimum marks in the array
	 */
	int minMarkStudent(int[] classMarks) {
		int min = Integer.MAX_VALUE;
		for(int iterator = 0; iterator < classMarks.length; iterator++) {
			if(min > classMarks[iterator])
				min = classMarks[iterator];
		}
		return min;
	}
	
	/**passPercentage provides the student passpercentage in an array
	 * @param classMarks that is an array that contains marks of the student
	 * @return passpercentage of the student in a class
	 */
	float passPercentage(int[] classMarks) {
		float noOfPassStudent=0;
		try{for(int iterator = 0; iterator < classMarks.length; iterator++) {
			if(classMarks[iterator] >= 40)
				noOfPassStudent++;
		}
		float passPercentageStudent = noOfPassStudent / classMarks.length * 100;
		return passPercentageStudent;}
		catch(ArithmeticException e) {
			System.out.print("There is an error ");
			return 0;
		}
	}
}
