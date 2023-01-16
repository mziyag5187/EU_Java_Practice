package EU8.week07_debugMod_NestedLoopBasics;

public class CommaIssueInLoops {

    public static void main(String[] args) {
        /*
         * A Deceptive problem
         * 
         * Write a for loop that displays numbers from 1 to 5, seperated by commas
         * 
         * output should be like;
         * 
         * 1,2,3,4,5
         * 
         */
    	
    	
        //1. approach  => 1    ,2  ,3  ,4  ,5
        System.out.print(1);
        
    	for (int i = 2; i <= 5; i++) {
			
    		System.out.print(", " + i);
		}
    	
        
        System.out.println();
        
        
        //2. approach => 1,  2,  3,  4,    5
        
        for (int i = 1; i <= 5-1; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(5);
        
        
        System.out.println( );
        
        
        //3. approach => 1, 2,
        



        //4. approach by using "break" keyword
        for (int i = 1; i <6 ; i++) {
            System.out.print(i);
            if (i==5){
                break;
            }
            System.out.print(", ");
        }


    }
}
    
