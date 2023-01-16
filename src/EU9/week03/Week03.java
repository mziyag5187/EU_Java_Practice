package EU9.week03;

public class Week03 {
    public static void main(String[] args) {

        /*) Java always understands;
                whole numbers as int 10 15 3
                decimal numbers as double
         */

        //*)always gives the result as the same data type with "bigger data type"

        System.out.println(10.0/3);
        //3 //3.333333333

        long x = 324999999999L;
        int y = 12;
        long result = x + y;

        //4) Execution order () * / %  + -
        System.out.println(4+17%2-1);
        //
        System.out.println(6-3*2+7-1);
        //
        System.out.println(8+12/(6-1));
        //

        //4) Casting
        System.out.println( (int) (7.9) + (int) (6.7));
        //7+6=13
        System.out.println( (int) (7.9 + 6.7));
        //14
        System.out.println((double)17);
        //17.0
        double abc=16; //int--- double implicit casting 16.0
        System.out.println((double)(8+3));
        //
        System.out.println((double)7/2);
        //
        System.out.println((double)(7/2));
        //
        System.out.println((int)(7.8+(double) (15)/2));
        //        //
        System.out.println("-------------------------------------------");

        //addition +
        //num+num

        System.out.println(100+100); //200

        //concatenation + ----> String
        //at least 1 String

            //data+String
            //String+data
            //String+String

        String school="Cydeo";

        System.out.println( school + "School" + 3 + 2);
        //CydeoSchool5 //CydeoSchool32

        System.out.println( school + "School" + 2 + (3 + 5) );
        //CydeoSchool28

        System.out.println( 4 + 16 + school + 'a');
        //416Cydeoa  //20Cydeoa

        System.out.println( 'a' + 'b'); //ab
        //195

        System.out.println('a'+ "" + 'b'); //ab
        // ""+'a' ----> a String

        // !!!! easy way to convert a char to a string is to add an empty String "" !!!

        String s1="s", s2;

        double d1, d2;

        int i1; int i2;

        int i3; int i4;
    }
}
