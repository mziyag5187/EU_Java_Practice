package EU8_Group33.week10_Arrays;

import java.util.Scanner;

public class SampleFlagUsage {

	public static void main(String[] args) {
		
	   /*   write a program that gives you the substring part of between
	        two different chars passed by the user as inputs

            Example:
            String letters = "abcdefgjijklmnoprstvyzx";

            input chars :     a , f
            output      :     bcde

            input chars :     e , o
            output      :     fgjijklmn
       */

        String letters = "abcdefgjijklmnoprstvyzx";


        // To get the input letters from the user
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first letter as lowercase: ");
        //Since we don't have any method of Scanner class to grasp the char values
        char char1 = scan.next().charAt(0);
        System.out.println("Please enter the second letter as lowercase: ");
        char char2 = scan.next().charAt(0);

        String result = "";

        //crate a boolean variable in order to direct my execution flow
        boolean flag = false;
        // my flag variable starts keeping false as boolean, then, according to my logic,
        // by using this flag variable, I will try to control my code execution flow

        for(int i = 0; i < letters.length(); i++){

            if(letters.charAt(i) == char1){//starts taking the letters in order
                flag = true;
                continue;
            }else if( letters.charAt(i) == char2){//stops taking the letters from the rest
                flag = false;
            }

            if(flag){
                result += letters.charAt(i);
            }
        }

        System.out.println(result);

	}       

}
