// You will be given an array containing only 0s, 1s and 2s. you have sort the array in linear time that is O(N) where N is the size of the array.

// Input Format
// The first line contains N, which is the size of the array. The following N lines contain either 0, or 1, or 2.

// Constraints
// 1 <= N <= 10^6
// Each input element x, such that x ∈ { 0, 1, 2 }.

// Output Format
// Output the sorted array with each element separated by a newline.

// Sample Input
// 5
// 0
// 1
// 2
// 1
// 2
// Sample Output
// 0
// 1
// 1
// 2
// 2

import java.util.*;

public class SortingInLinearTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortcolors(arr);
        sc.close();
    }

    public static void sortcolors(int[] nums) {

        // write your code here
        
        int low  = 0, mid = 0, high = nums.length-1;
        
        while(mid <= high){ 
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        
        }
        
    }
        
    public static void swap(int[] arr, int low, int high){
        
        int temp = arr[low];
        
        arr[low] = arr[high];
        arr[high] = temp;
    }
        
}
