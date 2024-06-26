// You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.

// Input Format
// First line contains number of test cases, T. Next T lines contains integers, n and k.

// Constraints
// 1<=T<=10
// 1<=N<=10^15
// 1<=K<=10^4

// Output Format
// Output the integer x

// Sample Input
// 2
// 10000 1
// 1000000000000000 10
// Sample Output
// 10000
// 31
// Explanation
// For the first test case, for x=10000, 10000^1=10000=n
import java.util.*;

public class kth_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(kthRoot(n, k));
            t--;
        }
        sc.close();
    }

    public static long kthRoot(long n, long k) {
        long lo = 1;
        long hi = n;
        long ans = 0;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
