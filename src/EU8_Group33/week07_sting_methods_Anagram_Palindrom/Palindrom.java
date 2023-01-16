package EU8_Group33.week07_sting_methods_Anagram_Palindrom;

import java.util.Scanner;

public class Palindrom {

    /*
      Palindrome : A string if it is the same, if we start reading it from left to right or right to left.

        Ex: nursesrun, madam, racecar

     */

	
	public static void main(String[] args) {

        // racecar
        // 0 r != r
        // 1 a != a
        // 2 c != c
        // 3 -> 7/2 = 3 < 3 --> loop stops

        // handles both even and odd numbers according to the string length
        // dad 3/2 1
        // anna 4/2 2

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the word : ");
        String str = input.next();
        boolean isPalindrome = true;

        // I will assume the String variable as two part just by dividing it from the middle
        // then, I am gonna compare the first parts letters with the second part letters
        // but before doing that, I need to define my loops limit level
        // which most likely will be the half of the number of its length

        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
            }

        }

        System.out.println("result : " + isPalindrome);


    }
}
