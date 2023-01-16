package EU8.week09_Arrays;

import java.util.Scanner;

public class SampleFlagUsage {

	public static void main(String[] args) {
		
	   //write a method that gives you the letters between two different
	   //items given among your array elements
		
       char[] letters = {'a','b','c','s','h','e','l'};

        // To get the input letters from the user
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first letter as lowercase: ");
        //Since we don't have any method of Scanner class to grasp the char values
        char char1 = scan.next().charAt(0);
        System.out.println("Please enter the second letter as lowercase: ");
        char char2 = scan.next().charAt(0);


        String result="";
        boolean flag = false;
        // my flag variable starts keeping false as boolean, then, according to my logic, using this flag variable
        // I will try to control my code execution flow


	}

}
