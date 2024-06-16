// Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.

// Input Format
// The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.

// Constraints
// N<=1000 Digits in binary representation is <=16.

// Output Format
// N lines,each containing a decimal equivalent of the binary number.

// Sample Input
// 4
// 101
// 1111
// 00110
// 111111
// Sample Output
// 5
// 15
// 6
// 63
// Explanation
// For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.

import java.util.Scanner;

public class VonNeumanLovesBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            DecimalPresent(sc.nextInt());
        }

        sc.close();
    }
    public static void DecimalPresent(int a){
        int temp = a;
        int num = 0;
        int idx = 0;
        while(temp != 0){
            int digit = temp%10;
            num += Math.pow(2, idx) * digit;
            temp /= 10;
            idx++;
        }
        System.out.println(num);
        
    }
        
}
