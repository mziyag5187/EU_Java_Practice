package EU8.week09_Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
/*
   Move all zeros to the end of the array

   array = {1,0,2,0,3,0,0,4,5,6,7}

   output: {1,2,3,4,5,6,7,0,0,0,0}

 */
	
	public static void main(String[] args) {

		int[] arr = {1, 0, 2, 0, 3, 0, 0, 4, 5, 6, 7};


	//1. WAY OF SOLUTION - by utilizing from the Array general structure
		int[] result = new int[arr.length];

		int i = 0;

		for(int each : arr) {

			if(each != 0) {
				result[i++] = each;
			}

		}

		System.out.println(Arrays.toString(result));

	//2. WAY OF SOLUTION - by using two different iterator variable at the same time

		int[] newArray = new int[arr.length];

		int begin = 0;
		int end = arr.length-1;

		for(int number : arr){

			if(number == 0){
				newArray[end--] = number;
			}else{
				newArray[begin++] = number;
			}

		}

		System.out.println(Arrays.toString(newArray));


	}
}






