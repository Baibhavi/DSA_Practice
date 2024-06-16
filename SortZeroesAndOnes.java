// Sort just 0 and 1

// Input Format
// A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space

// Constraints
// N will not exceed 10^7

// Output Format
// Sorted Sequence

// Sample Input
// 7
// 1 0 0 1 1 0 1
// Sample Output
// 0 0 0 1 1 1 1

import java.util.*;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Sort(arr, n);
        sc.close();
    }
    public static void Sort(int[] arr, int n){

        int left = 0, right = n-1;        
        while(left < right){
            if(arr[left] == 1){
                if(arr[right] != 1){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                right--;
            }
            else{
                left++;
            }
        }
        for(int i: arr){
        
        System.out.print(i + " ");
        
        }
        
    }
        
}
