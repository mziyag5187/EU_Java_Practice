package EU10.week09_Arrays;

import java.util.Arrays;

public class FindTheLargestNumber {
    public static void main(String[] args) {

        //1- Find the largest number of Array
        //Input: arr[] = {10, 4, 3, 50, 23, 90}
        //Output: 90

        int[] numbers = {10, 4, 3, 50, 23, 90};

        int largestNum = numbers[0];

        //Traditional way
        for (int number : numbers) {
            if(number > largestNum){
                largestNum = number;
            }
        }
        System.out.println(largestNum);

        // Modern way using Stream interface
        int biggest = Arrays.stream(numbers).max().getAsInt();

        System.out.println(biggest);

    }
}
