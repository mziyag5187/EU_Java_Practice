package EU8_Group33.week11_methods_recursive;

public class Factoriel_Recursive_Methods {

	  public static void main(String[] args) {
	        System.out.println("Factorial of = " + factorial(5));
	  }

	  public static int factorial(int num){

	  	if(num >= 1){
	  		return  num * factorial(num-1);
		}else {
	  		return 1;
		}

	  }
	  


}
