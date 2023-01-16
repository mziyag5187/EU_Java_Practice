package EU8_Group33.week06_scanner_elseIfWorkingFlow;

import java.util.Scanner;

public class Scanner_Test {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first name: "); // most probably only one word
        String firstName = input.next(); // Mike + Enter 
        
        System.out.println("Please enter your last name: "); // most probably only one word
        String lastName = input.next();// Smith + Enter
        
        System.out.println("Please enter your age: ");
        int age = input.nextInt();// 35 + Enter

        input.nextLine();// it will catch the empty Enter which is coming from the previous line (line 19)

        System.out.println("Please enter your adress: "); // requires more than one word as adress value
        String address = input.nextLine();//

        System.out.println("Please enter your gender as F or M");
        char gender = input.next().charAt(0); // to be able to catch the first letter of the given String by user

        if (gender == 'F') {
            System.out.println("Female");
        } else if (gender == 'M') {
            System.out.println("Male");
        } else {
            System.out.println("not valid gender");
        }

        input.close();
                
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Adress     : " + address);
        System.out.println("Age        : " + age);
        System.out.println("Gender 	   : " + gender);


        
	}

}
