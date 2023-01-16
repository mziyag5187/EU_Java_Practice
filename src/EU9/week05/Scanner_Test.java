package EU9.week05;

import java.util.Scanner;

public class Scanner_Test {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first name: "); // most probably only one word
        String firstName = input.next(); // Mike
        
        System.out.println("Please enter your last name: "); // most probably only one word
        String lastName = input.next();// Smith

        System.out.println("Please enter your age: ");
        int age = input.nextInt();// 30

        System.out.println("Please enter your adress: ");  // requires more than one word as an adress value
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
