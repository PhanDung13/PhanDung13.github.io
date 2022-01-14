package exercise4;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] myIntArray = {43, 32, 53, 23, 12, 34, 3, 12, 43, 32};
		int [] reversedArray = new int[myIntArray.length];
		for(int i=0;i<myIntArray.length;i++)
			reversedArray[i] = myIntArray[myIntArray.length-i-1];
		System.out.print("Original Array: ");
		for(int i=0;i<myIntArray.length;i++)
			System.out.print(myIntArray[i]+" ");
		System.out.print("\nReversed Array: ");
		for(int i=0;i<myIntArray.length;i++)
			System.out.print(reversedArray[i]+" ");
			
	}
}
