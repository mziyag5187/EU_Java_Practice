package EU9;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
                /*
        Given:
        Integer [] nums ={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10};
        return the fifth element after removing the duplicates
        do not change the order of the elements

         */


        Integer [] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        nums= new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));


        System.out.println("----------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";
        //eabcd
        //54434

        String result = "";//a4b4c4d3e5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

            result += each+ Collections.frequency(Arrays.asList(str.split("")),each);
        }

        System.out.println(result);
    }
}
