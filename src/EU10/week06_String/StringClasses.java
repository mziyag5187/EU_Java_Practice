package EU10.week06_String;

public class StringClasses {

            public static void main(String[] args) {

            // String Builder and StringBuffer objects are mutable (modifiable) => it does not require reassigning
                StringBuffer s1 = new StringBuffer("Mike");
                s1.append(" John");

                System.out.println("StringBuffer : " + s1);

                StringBuilder s2 = new StringBuilder("Mike");
                s2.append(" John");

                System.out.println("StringBuilder : " + s2);

            // String objects are immutable => it requires reassigning
                String name = new String("Mike");
                name.concat(" John");

                System.out.println("String :" + name);










            /*   ====================================================================
            // isEmpty()

                String word = "";

                System.out.println(word.trim().isEmpty());
                System.out.println(word.length());

            */














            /* ==========================================================================
                String str1 = "dog";
                String str2 = "cat";

                System.out.println(str1 = str2); // assignment sign

                System.out.println("========");

            */




    }
}
