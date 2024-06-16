// Given an array nums of length n. We define a running sum of an array as for every index runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of array for each i (0 <= i < n).

// Input Format
// First line contains an integer n representing number of elements. Next line contains n integers denoting array elements.

// Constraints
// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6

// Output Format
// An integer representing running sum array of the given array

// Sample Input
// 4
// 1 2 3 4
// Sample Output
// 1 3 6 10
// Explanation
// Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

import java.util.*;
public class RunningSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0] + " ");
        for(int i = 1; i < n; i++){
            arr[i] = arr[i]+arr[i-1];
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
