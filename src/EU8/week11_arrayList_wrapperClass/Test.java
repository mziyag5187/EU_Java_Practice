package EU8.week11_arrayList_wrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        System.out.println("Q-8 : ==================================");

        ArrayList<Integer> nums = new ArrayList<>();
        Integer a = 7;

        System.out.println(nums.remove(a));


        System.out.println("Q-10 : ==================================");

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.addAll(Arrays.asList(1,2,3,4,5));

        arrList.set(0, arrList.get(4));
        arrList.set(4, arrList.get(0));

        System.out.println(arrList);

    }




}







