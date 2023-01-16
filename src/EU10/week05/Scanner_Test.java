package EU10.week05;

import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first name: "); // most probably only one word
        String firstName = input.next(); // Mike
        
        System.out.println("Please enter your last name: "); // most probably only one word
        String lastName = input.next();// Smith

        System.out.println("Please enter your age: ");
        int age = input.nextInt();// 30 + Enter

        input.nextLine(); // to capture the "Enter" key that user passed for the previous nextInt()

        System.out.println("Please enter your adress: ");  // requires more than one word as an address value
        String address = input.nextLine();// New York USA

        System.out.println("Please enter your gender as F or M");
        char gender = input.next().charAt(0); // M

        input.close();
                
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Adress     : " + address);
        System.out.println("Age        : " + age);
        System.out.println("Gender 	   : " + gender);
	}

}
