package EU8.week09_Arrays;

import java.util.Arrays;

public class ShiftLeft {

    /*
    Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
    You may modify and print the given array, or print a new array.`
     */

    public static void main(String[] args) {

        int [] arr = {6, 2, 5, 3};

        // in order not to lose my first element's value in the array
        // need to use one temporary variable
        int temp = arr[0];

        for(int i=0 ; i < arr.length-1 ; i++) {
            arr[i] = arr[i+1]; // will assign index 1 to 0, 2 to 1, 3 to 2 ..so on..

        }

        //lastly I should assign my array's last element's value by using my temp variable
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));


    }












    //i=0   =>    2,2,5,3
    //i=1   =>    2,5,5,3
    //i=2   =>    2,5,3,3
}
