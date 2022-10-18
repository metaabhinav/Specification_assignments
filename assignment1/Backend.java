package assignment1;
//import java.util.*;
/**
 * @author Abhinav
 * @version 1.0
 * @since 17/10/2022
 * this class contains methods of getCompare, getReverse, replace Characters, max length word in a string. 
 */
public class Backend {
	
	/** getCompare function return whether two strings are same or not 
	 * 
	 * @param input1 takes string that contains all types of characters
	 * @param input2 takes string that contains all types of characters
	 * @return 1 if the string1 and string 2 is same and return 0 if string 1 and string 2 is different
	 */
	int getCompare(String input1, String input2) {
		if(input1.length() != input2.length()) {
			return 1;
		}
		else {
			int iterator = 0;
			while(iterator < input1.length()) {
				if(input1.charAt(iterator) != input2.charAt(iterator))
					return 0;
				iterator++;
			}
			return 1;
		}
	}
	/**
	 * getReverse return the reverse of the string
	 * @param input1 takes string as an input with any characters
	 * @return a string that is reverse of the input string
	 */
	String getReverse(String input1) {
		StringBuilder tempStr = new StringBuilder();
		for(int iterator = input1.length()-1; iterator >= 0; iterator--) {
			tempStr.append(input1.charAt(iterator));
		}
		String outputStr = tempStr.toString();
		return outputStr;
	}
	
	/**
	 * replaceCharacter replace the uppercase letters to lowercase letters and vice versa
	 * @param input1 takes string as an input with any characters
	 * @return a string that has replaced uppercase letter to lowercase letter and vice versa
	 */
	String replaceCharacter(String input1) {
		StringBuilder outputString = new StringBuilder();
		for(int iterator = 0; iterator < input1.length(); iterator++) {
			char temp = input1.charAt(iterator);
			int ascii = temp;
			if(ascii > 96 && ascii < 123) {
				ascii = ascii - 32;
				char tempChar = (char)ascii;
				outputString.append(tempChar);
			}
			else if(ascii > 64 && ascii < 91) {
				ascii = ascii + 32;
				char tempChar = (char)ascii;
				outputString.append(tempChar);
			}
			else {
				outputString.append(input1.charAt(iterator));
			}
		}
		String replacedOutput = outputString.toString();
		return replacedOutput;
	}
	
	/**
	 * maxWord provide the word with max length ina string
	 * @param input1 as a string that contains many words
	 * @return the word that has max length in a given string
	 */
	String maxWord(String input1) {
		 String word = "", maxLenWord="";    
	      String[] words = new String[100];  
	      int length = 0;    
		  input1 = input1 + " ";    
          for(int iterator = 0; iterator < input1.length(); iterator++){ 
        	  int ascii =input1.charAt(iterator);
	          if((ascii < 123 && ascii > 96)||(ascii < 91 && ascii > 64)){    
	              word = word + input1.charAt(iterator);    
	          }    
	          else{        
	              words[length] = word;      
	              length++;    
	              word = "";    
	          }    
	      }   
        maxLenWord = words[0];
        for(int iterator = 0; iterator < length; iterator++){       
            if(maxLenWord.length() <= words[iterator].length())    
            	maxLenWord = words[iterator];    
        }    
		return maxLenWord;
	}
}





