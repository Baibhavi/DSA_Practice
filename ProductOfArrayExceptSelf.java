// Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].

// Challenge : do this without division in linear time

// Input Format
// First line contains integer N as size of array.
// Next line contains a N integer as element of array. The product of any prefix or suffix of arr is NOT guaranteed to fit in a 32-bit integer.

// Constraints
// -10000000 < arr[i]<=10000000

// Output Format
// Print output array

// Sample Input
// 4
// 1 2 3 4
// Sample Output
//24 12 8 6 

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] arr = new long[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLong();
		}
		
		ProducToArrayExceptSelf(arr,n);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

        sc.close();
	}

	private static long[] ProducToArrayExceptSelf(long[] arr, int n) {
		
		long[] left = new long[n];
		long[] right = new long[n];
		
		left[0]=1;
		for (int i = 1; i < left.length; i++) {
			left[i]=left[i-1]*arr[i-1];
		}

		right[n-1]=1;
		for (int i = n-2; i>=0 ; i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = left[i] * right[i];
		}
		
		return arr;
    }
}
