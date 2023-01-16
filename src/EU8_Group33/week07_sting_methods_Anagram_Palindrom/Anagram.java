package EU8_Group33.week07_sting_methods_Anagram_Palindrom;

import java.util.Scanner;

public class Anagram {

	/*
*  Write a program that will accept two Strings and determine if they
*  are Anagrams of each other
	
	->  listen 
		silent 
	->  mary
		army
	 */
	
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first string : ");
	    String one = input.next();
        System.out.println("Please enter the second string : ");
	    String two = input.next();

		boolean isAnagram;

		// need to check the length of the both Strings should be same
		if(one.length() != two.length() ){
			isAnagram = false;
		}

		//I will remove the letters of one string from two String one by one in a loop
		for (int i = 0; i < one.length() ; i++){
			char each = one.charAt(i);
			two = two.replaceFirst(each+"","");
		}

		//at the end if two String variable is empty, then it means this two Strings are Anagram
		if(two.isEmpty()){
			isAnagram = true;
		}else{
			isAnagram = false;
		}

		System.out.println("result : " + isAnagram);
	}
}
	

	
	
	
	
	
	
	

