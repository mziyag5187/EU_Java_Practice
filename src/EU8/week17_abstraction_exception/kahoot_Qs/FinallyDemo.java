package EU8.week17_abstraction_exception.kahoot_Qs;

public class FinallyDemo{
    public static int myMethod()
    {
        try {
            //try block
            return 0;
        }
        finally {
            //finally
            System.out.println("Inside Finally block");
        }
    }
    public static void main(String args[])
    {
        System.out.println(FinallyDemo.myMethod());
    }
}
