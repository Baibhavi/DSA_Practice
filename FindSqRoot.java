import java.util.Scanner;
public class FindSqRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(FloorSqRoot(n));
    }
    public static int FloorSqRoot(int x){
        if(x == 0 || x == 1){
            return x;
        }
        long start = 1, end = x/2, ans = 0;
        while(start<=end){
            long mid = (start+end)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            else if(mid*mid < x){
                start = mid+1;
                ans = mid;
            }
            else{
                end = mid-1;
            }
        }
        return (int)ans;
    }
}
