package EU8.week10_methods_recursive;

public class GetTheLettersBetweenTwoItem {

	public static void main(String[] args) {
		
	   //write a method that gives you the letters between two different
	   //items given among your array elements
		
       char[] letters = {'a','b','c','s','h','e','l','l','o','m','l','m','a','n'};
       System.out.println(getBetween(letters,'s','m'));
       System.out.println(getBetween(letters,'b','o'));
	}

	// create a method that takes one array and two char as parameters
	public static String getBetween(char[] letters, char firstChar, char secondChar) {

		String result="";
		//crate a boolean variable in order to direct my execution flow
		boolean flag = false;
		// my flag variable starts keeping false as boolean, then, according to my logic,
		// using this flag variable, I will try to control my code execution flow

		for (int i = 0; i < letters.length; i++) {

			if (letters[i] == firstChar){
				flag=true;
				i++;//continue;
			}else if (letters[i]==secondChar){
				flag=false;
			}

			if (flag){
				result+=letters[i];
			}
		}

		return result;
	}



}
