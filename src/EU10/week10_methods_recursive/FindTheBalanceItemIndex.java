package EU10.week10_methods_recursive;

public class FindTheBalanceItemIndex {
	/*
     *  Given an array of integers, write a function to return the index of an item
     *   in the array, where the sum of all items on its left is equal to the sum
     *   of the ones on the right.
     *   For example :
           Given [4, 9, 1, 3, 6, 4]
           your function should return 2
           because the item at index 2 is 1, and 4+9 =3+6+4
     */
	public static void main(String[] args) {

		int[] array = {4, 9, 1, 3, 6, 4};

// My logic steps to solve the question;

		// 1- Create an int variable called "balanceIndex" that I will assign my result at the end
		int balanceIndex = 0;

		// 2- Iterate each element of the given array one by one => for loop
		// 3- In each iteration, need to calculate the sum of beforeIndex and afterIndex based on the current element's index
		// I should create two different methods for those two different calculation
		// It will make my job easy to solve the question
		// These methods should take two parameters -> 1- given array 2- current index number
		// 4- Then compare both of them and if they are equal to each other, I should assign that element's index to my variable
		// 5- Print out the "balanceIndex" variable

		for (int i = 0; i < array.length; i++) { // 2. step

			if (addBeforeIndex(array, i) == addAfterIndex(array, i)) {//3. and 4. steps
				balanceIndex = i; //4. step
			}
		}
		System.out.println(balanceIndex); //5. step
	}

	// create one method to sum the numbers BEFORE index
	public static int addBeforeIndex(int[] array, int index) {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += array[i];
		}
		return total;
	}

	// create one other method to sum the numbers AFTER index
	public static int addAfterIndex(int[] array, int index) {
		int total = 0;
		for (int i = index + 1; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}

}

