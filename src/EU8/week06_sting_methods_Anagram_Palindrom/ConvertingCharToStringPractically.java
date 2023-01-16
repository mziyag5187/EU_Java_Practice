package EU8.week06_sting_methods_Anagram_Palindrom;

public class ConvertingCharToStringPractically {

	public static void main(String[] args) {
		 
		 String str = "jaVA";
		 
		 				 //      j       +"" => converts char to String
		 System.out.println(str.charAt(0)+"".toUpperCase());// J
		 
		 System.out.println(str.substring(0,1).toUpperCase());// J
		 
		 //making only the first char capital and the others lowercase
		 System.out.println(str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase()); //Java
		
		 //to sum char and an integer
		 System.out.println( (char) ('a' + 1) ); // b

		 
		 

		 
		 System.out.println("============================");
		 
		 
		 //Example related to why we need String Manipulation as an SDET
		 
		 String actualResult = "Favorilerim (3)";
		 String expectedResult = "3";

		 //Getting the dynamic part of our actual result which represents the number inside the paranthes
		 String myNumber = actualResult.substring(actualResult.indexOf("(")+1,actualResult.indexOf(")"));

		 if(myNumber.equals(expectedResult)){
		 	System.out.println("Test case PASSED");
		 }else{
			 System.out.println("Test case FAILED");
		 }

	 }
}
