// Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which inverses the array. Print the values of inverted array

// Input Format
// Enter a number N and take N more inputs

// Constraints
// None

// Output Format
// Display the values of the inverted array in a space separated manner

// Sample Input
// 5
// 0 2 4 1 3
// Sample Output
// 0 3 1 4 2
// Explanation
// Swap element with index

// for eg : element 4 at index 2 becomes element 2 at index 4

import java.util.Scanner;

public class InverseArray {
    public static void main(String args[]) {

        // Your Code Here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        int[] invertedArr = new int[n];
        inverse(arr, invertedArr, 0);
        for (int i : invertedArr) {
            System.out.print(i + " ");

        }
        sc.close();

    }

    public static void inverse(int[] arr, int[] invertedArr, int idx) {

        if (idx == arr.length) {

            return;

        }
        invertedArr[arr[idx]] = idx;
        inverse(arr, invertedArr, idx + 1);

    }

}