package EU8_Group33.week08_debugMod_NestedLoopBasics;

public class FrequencyOfWords_DynamicWay {
    public static void main(String[] args) {

   //1. USING FOR LOOP:

        String  str = "JavaJavaJavaJavaJava";

        String givenWord = "Java"; // 4 letters in the given word

        int frequency = 0;

        for (int i = 0; i <= str.length()-4 ; i++) {

            String eachSub = str.substring(i, i+4 );

            if(eachSub.equals("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);

    // Let's make the first solution DYNAMIC
    // I mean we will make our solution to handle EVERY CASE WITHOUT MATTERING whatever the given word length() is.

        System.out.println("=========================================");

        String  str1 = "JavaJavaJavaJavaJava";

        String givenWord1 = "Java"; // 4 letters in the given word

        int frequency1 = 0;

        for (int i = 0; i <= str1.length()- givenWord1.length() ; i++) {

            String eachSub = str1.substring(i, i + givenWord1.length() );

            if(eachSub.equals(givenWord1)){
                frequency1++;
            }

        }

        System.out.println(frequency1);

        System.out.println("=========================================");


    //2. USING WHILE LOOP::

        String str2 = "Java Java Python Python";

        int frequency2 = 0;

        while(str2.contains("Java")){
            str2 = str2.replaceFirst("Java", "");
            frequency2++;
        }

        System.out.println(frequency2);
    }
}
