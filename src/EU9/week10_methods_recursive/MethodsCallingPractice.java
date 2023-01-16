package EU9.week10_methods_recursive;

public class MethodsCallingPractice {
    public static void main(String[] args) {

        String one = "two";
        String two = "three";
        String three = "1";
        int number = 20;

        sentence(one, two, 3); //
        sentence(two, three, 14);//
        sentence(three, three, number + 1); //
        sentence(three, two, 1); //
        sentence("eight", three, number / 2); //

    }

    public static void sentence(String three, String one, int number) {

        System.out.println(one + " times " + three + " = " + (number * 2));

    }
}









/*
    /// SOLUTIONS
    sentence(one, two, 3); //three times two = 6
    sentence(two, three, 14);// 1 times three= 28
    sentence(three, three, number + 1); //1 times 1 = 42
    sentence(three, two, 1); //three times 1 = 2
    sentence("eight", three, number / 2); //eight times 1 =20

 */
