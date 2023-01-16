package EU8.week07_debugMod_NestedLoopBasics;

public class Test {

    public static void main(String[] args) {
        String comma="";

        for (int i = 1; i <= 5; i++) {
            System.out.print(comma + i);
            comma = ", ";
        }
    }
}
