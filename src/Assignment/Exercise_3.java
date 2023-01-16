package Assignment;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise_3 {

    /**
     * Q1. Identify 'alist' and 'avalue' *valid* values that cause the
     * function not to behave according to its specification (or that cause
     * ambiguity regarding the function specification appearing on the
     * heading)
     *
     * Answer1:
     *  ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(2, 6, 3, 3, 1, 0, 4, 5, 5));
     *  Integer A = 6;
     *
     *  Once I provide the above list and sum value as 6
     *  The method inside the assignment gives me a lot of duplicated and redundant pairs at the end of execution which we actually do
     *  not wanna to see inside our result
     *
     *
     * Q2. Current implementation is not efficient. Mention its order of
     * complexity.
     *
     * Answer2:
     *  a-It is not efficient since it tends to also give us the duplicated pairs matching with our requirement
     *  b-So, we will be getting the same pair again and again, if the same number appears in the next order inside the given list
     *
     *
     * Q3. Implement a more efficient version and if possible, a version
     * that does not have any issue identified in point 1 above. Mention
     * the order of complexity of the new version.
     *
     * Answer3:
     *   I used Map in order to avoid having duplicate pairs in my result since Maps do not accept duplicate keys in their structure.
     *   and I also decided to start my second(inner) loop from the point increasing the first i iterator with by one so that I can
     *   reduce the duplicated pairs number in my result
     *   Lastly, according to my logic, I wrote the following method that I named as "getPairsForValueUsingMap" for this task.
     *   and it returns an empty list when it can not find any matching pair inside the list.
     *
     * My solution is just inside the Exercise3 class..
     */

    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 4, 2));

        Integer A = 4;

        ArrayList<Pair<Integer, Integer>> result = getPairsForValue(alist, A);
        System.out.println(result);

        System.out.println("getPairsForValueMap(alist,A) = " + getPairsForValueUsingMap(alist, A));
        System.out.println("the size of getPairsForValueMap(alist,A) = " + getPairsForValueUsingMap(alist, A).size());

    }

    // the given solution inside the assignment
    public static ArrayList<Pair<Integer, Integer>> getPairsForValue(ArrayList<Integer> alist, Integer avalue) {

        ArrayList<Pair<Integer, Integer>> ret = new ArrayList<>();

        for (int i = 0; i < alist.size(); i++) {
            for (int j = 0; j < alist.size(); j++) {
                if (alist.get(i) + alist.get(j) == avalue) {
                    ret.add(new Pair<Integer, Integer>(alist.get(i), alist.get(j)));
                }
            }
        }
        return ret;
    }

    //my solution method for the answer to Question-3 of Exercise-3
    public static Map<Integer, Integer> getPairsForValueUsingMap(ArrayList<Integer> alist, Integer avalue) {

        Map<Integer, Integer> ret = new HashMap<>();
        // iterate on each number of the alist one by one
        for (int i = 0; i < alist.size(); i++) {
            Integer eachNum = alist.get(i);
            // start the inner loop from i+1 since we don't want to include duplicate pairs having the same numbers
            for (int j = 0 ; j < alist.size(); j++) {
                // if the sum of the numbers equal to avalue parameter as given value
                if (eachNum + alist.get(j) == avalue) {
                    // and also it hasn't been added to our ret map previosuly as one of the keys or values to avoid duplicate pairs
                    if(!ret.containsKey(eachNum) && !ret.containsValue(eachNum))
                        //add the pair to our ret map
                        ret.put(eachNum, avalue-eachNum);
                }
            }
        }
        return ret;
    }
}





