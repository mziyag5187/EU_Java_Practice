package EU8.week05_ElseIf_SwappingNumbers;

public class Test {

    public static void main(String[] args) {

        int a=3;

        int res  = - a--;
/*
        a in memory ⇒  1   →  0  →   1   →   0  → -1 (last value of a in the memory)

        result ⇒      -1   +  0   / -1   *  -1  ⇒ -1 + 0 * -1 ⇒ -1 + 0 ⇒ -1
*/

        System.out.println("a = " + a);//-1
        System.out.println("res = " + res);//-1

    }
}
