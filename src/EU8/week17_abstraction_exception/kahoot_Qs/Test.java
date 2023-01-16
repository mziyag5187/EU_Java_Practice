package EU8.week17_abstraction_exception.kahoot_Qs;

abstract class Data {

    //public abstract static void printHello();
}

public final class Test extends Data {

    //@Override
    public static void printHello() {
        System.out.println("Hello Cybertek");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.printHello();
    }
}