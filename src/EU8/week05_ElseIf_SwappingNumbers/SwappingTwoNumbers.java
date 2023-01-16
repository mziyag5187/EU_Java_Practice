package EU8.week05_ElseIf_SwappingNumbers;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        
        /*SWAPPING 2 NUMBERS*/

        int first=5;
        int second=10;

        //1- first approach using DUMMY VARIABLE temporarily

        int dummy;

        dummy = first; // dummy = 5;
        first = second; // first = 10;
        second = dummy; // second =5;



        System.out.println("first: "+ first);// first : 10
        System.out.println("second: "+ second);//second : 5

        System.out.println("======================================");



        //2- second approach using ADDITION and SUBSTRACTION

        first=5;
        second=10;

        first  = first + second; //first = 5 + 10 = 15
        second = first - second; // second = 15 - 10 = 5
        first  = first - second; // first = 15 - 5 = 10


        System.out.println("first: "+ first);
        System.out.println("second: "+ second);



        System.out.println("======================================");

        //3- third approach using DIVISON and MULTIPLICATION

        first=5;
        second=10;

        first = first * second; //first = 5 * 10 = 50
        second = first / second; // second = 50 / 10 = 5
        first = first / second; // first = 50 - 5 = 10
                
        
        System.out.println("first: "+ first);
        System.out.println("second: "+ second);
   
    }
    
}