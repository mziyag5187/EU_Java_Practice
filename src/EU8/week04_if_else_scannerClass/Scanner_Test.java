package EU8.week04_if_else_scannerClass;

import java.util.Scanner;

public class Scanner_Test {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first name: "); // most probably only one word
        String firstName = input.next(); // Mike + Enter 
        
        System.out.println("Please enter your last name: "); // most probably only one word
        String lastName = input.next();// Smith + Enter
        
        System.out.println("Please enter your city: ");
        String age = input.next();// 35 + Enter

            input.nextLine();

        System.out.println("Please enter your adress: "); // requires more than one word as adress value
        String address = input.nextLine();//

        System.out.println("Please enter your gender as F or M");
        char gender = input.next().charAt(0);

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
