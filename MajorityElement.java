// Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.

// You may assume that the array is non-empty and the majority element always exist in the array.

// Input Format
// First line contains integer N (size of the array) followed by N more integers.

// Constraints
// Output Format
// Majority Element of array

// Sample Input
// 3
// 1 1 2
// Sample Output
// 1
// Explanation
// Number of 1's in the array is more than 3/2 , Hence majority element is 1

import java.util.*;

public class MajorityElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int m = isMajority(arr, arr[i]); 
            if(m > n/2){
                System.out.println(arr[i]);
                break;
            }
        }
        sc.close();
    }
    public static int isMajority(int[] arr, int cand){
        int c = 0;
        for(int i: arr){
            if(i == cand){
                c++;
            }
        }
        return c;
    }
}