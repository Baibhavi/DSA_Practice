// You are provided two sorted arrays. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.
// link

// Input Format
// First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

// Constraints
// 1<=t<=100 1<=n,m, nums1[i], num2[i]<=100000

// Output Format
// Print the maximum path Sum.

// Sample Input
// 2
// 8 8
// 2 3 7 10 12 15 30 34
// 1 5 7 8 10 15 16 19
// 5 4
// 2 4 5 8 10
// 4 6 8 9

// Sample Output
// 122
// 30
// Explanation
// Test Case1 Explanation :- 122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34

import java.util.Scanner;

public class MaxSumPathInTwoArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] a = new int[m];
            int[] b = new int[n];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(maxSumPath(a, b));
        }
        sc.close();
    }

    public static int maxSumPath(int[] a, int[] b) {
        int i = 0, j = 0;
        int sumA = 0, sumB = 0;
        int result = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                sumA += a[i++];
            } else if (a[i] > b[j]) {
                sumB += b[j++];
            } else { // a[i] == b[j]
                result += Math.max(sumA, sumB) + a[i];
                sumA = 0;
                sumB = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements of a[]
        while (i < a.length) {
            sumA += a[i++];
        }

        // Add remaining elements of b[]
        while (j < b.length) {
            sumB += b[j++];
        }

        result += Math.max(sumA, sumB);
        return result;
    }
}
