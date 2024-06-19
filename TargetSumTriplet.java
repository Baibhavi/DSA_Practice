// Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.

// Input Format
// First line contains input N.
// Next line contains N space separated integers denoting the elements of the array.
// The third line contains a single integer T denoting the target element.

// Constraints
// Length of Array should be between 1 and 1000.

// Output Format
// Print all the triplet present in the array in a new line each. The triplets must be printed as A, B and C where A,B and C are the elements of the triplet ( A<=B<=C) and all triplets must be printed in sorted order. Print only unique triplets.

// Sample Input
// 9
// 5 7 9 1 2 4 6 8 3
// 10
// Sample Output
// 1, 2 and 7
// 1, 3 and 6
// 1, 4 and 5
// 2, 3 and 5
// Explanation
// Array = {5, 7, 9, 1, 2, 4, 6 ,8 ,3}. Target number = 10. Find any three number in the given array which sum to target number.

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplet {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		int target=sc.nextInt();
		Arrays.sort(arr);
		Arrays_Target_Sum_Triplets(arr,target);
        sc.close();

	}

	private static void Arrays_Target_Sum_Triplets(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(arr.length==1 && arr[0]==target)
			System.out.println(arr[0]);
		else if(arr.length==2 && (arr[0]+arr[1]==target))
			System.out.println(arr[0]+" and "+arr[1]);
		else
		{
			for(int i=0;i<arr.length-2;i++)
			{
				//			System.out.print("I ");
				for(int j=i+1;j<arr.length-1;j++)
				{
					if(j>=arr.length)
						break;
					//				System.out.print("LOVE ");
					for(int k=j+1;j<arr.length;k++)
					{
						if(k>=arr.length)
							break;
						//					System.out.print("YOU ");
						//					System.out.print(k+" ");
						//					System.out.println(arr[i]+""+arr[j]+""+arr[k]);
						if((arr[i]+arr[j]+arr[k])==target)
							System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
						//				System.out.println();
					}
					//				System.out.println();
				}
			}

		}
	}
}
