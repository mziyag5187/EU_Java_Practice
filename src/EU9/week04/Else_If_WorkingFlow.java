package EU9.week04;

public class Else_If_WorkingFlow {

    public static void main(String[] args) {

        int a = 1;

        if(false){ //will execute the condition code
            System.out.println("if1");
        }else if(true){//will execute the condition code
            System.out.println("if2");
        }else if (a++ > 5){ //will NOT execute the condition code
            System.out.println("if3");
        }

        System.out.println("a = " + a);
        //result:
        //if2
        //a = 1


        System.out.println("===========================================");

        int b = 1;

        if(false){ //will execute the condition code
            System.out.println("if1");
        }else if(false){ //will execute the condition code
            System.out.println("if2");
        }else if (b++ > 5){ //will execute the condition code
            System.out.println("if3");
        }

        System.out.println("b = " + b);

        //result :
        //b = 2
    }
}
