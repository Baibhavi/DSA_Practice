// Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

// A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

// Input Format
// First line contains integer t which is number of test case.
// For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

// Constraints
// 1<=t<=100
// 1<=n<=1000
// |Ai| <= 10000

// Output Format
// Print the maximum circular sum for each testcase in a new line.

// Sample Input
// 1
// 7
// 8 -8 9 -9 10 -11 12
// Sample Output
// 22
// Explanation
// Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)

import java.util.*;
public class MaximumCircularSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(circularSum(arr, n));
            t--;
        }
        sc.close();
    }

    public static int circularSum(int[] arr, int n) {
        int linearSum = kadane(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            arr[i] = -arr[i]; // Invert the array elements
        }
        int invertedArraySum = kadane(arr);
        int circularArraySum = sum + invertedArraySum; // Adding total sum and maximum sum of inverted array
        
        // Handle case where all numbers are negative
        if (circularArraySum == 0) {
            circularArraySum = linearSum;
        }
        
        return Math.max(linearSum, circularArraySum);
    }

    public static int kadane(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}


