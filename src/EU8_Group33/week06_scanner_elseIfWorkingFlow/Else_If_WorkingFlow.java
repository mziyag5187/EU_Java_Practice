package EU8_Group33.week06_scanner_elseIfWorkingFlow;

public class Else_If_WorkingFlow {

    public static void main(String[] args) {

        int a = 1;

        if(false){ //will be executed
            System.out.println("if1");
        }else if(true){//will be executed
            System.out.println("if2");
        }else if (a++ > 5){ //will NOT be executed
            System.out.println("if3");
        }

        System.out.println("a = " + a);
        //result:
        //if2
        //a = 1




        System.out.println("===========================================");

        int b = 1;

        if(b > 4){ //will be executed
            System.out.println("if1");
        }else if(b > 3){ //will be executed
            System.out.println("if2");
        }else if (b++ > 5){ //will be executed
            System.out.println("if3");
        }

        System.out.println("b = " + b);

        //result :
        // b = 2
    }
}
