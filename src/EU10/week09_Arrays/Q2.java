package EU10.week09_Arrays;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        //3- Reverse a string and put between each char " - "
        //Input : String str = "amazon"
        //Output : n-o-z-a-m-a

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = input.next();
        String result = "";

        for (int i = str.length()-1 ; i >= 0 ; i--) {
            char letter = str.charAt(i);
            if(i == str.length()-1){
                result += letter;
                continue;
            }
            result += "-" + letter;
        }

        System.out.println(result);

    }
}
