package assignment1;
import java.util.*;
public class DriverCode {
	public static void main(String args[]) {

		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the string 1 you want to get the compared");
		String input1=sd.nextLine();
		System.out.println("Enter the string 2 you want to get the compared");
		String input2=sd.nextLine();
		Backend question=new Backend();
		int compared=question.getCompare(input1, input2);
		if(compared==1)
			System.out.println("Yes both Strings are same");
		else
			System.out.println("No both strings are not same");
		System.out.println("Reverse of both strings are");
		String outputStr1=question.getReverse(input1);	
		System.out.println("1: "+outputStr1);
		String outputStr2=question.getReverse(input2);
		System.out.println("2: "+outputStr2);
		System.out.println("Replaced lower and uppercase of both strings");
		String replaceString1=question.replaceCharacter(input1);
		System.out.println("Replaced string of 1: "+replaceString1);
		String replaceString2=question.replaceCharacter(input2);
		System.out.println("Replaced string of 1: "+replaceString2);
		System.out.println("Enter the string that contains many words so that you can get word with max length");
		String inputLine=sd.nextLine();
		String maxLengthWord=question.maxWord(inputLine);
		System.out.println("Max length is "+maxLengthWord.length()+" and the word is "+maxLengthWord);
		sd.close();
	}
}
