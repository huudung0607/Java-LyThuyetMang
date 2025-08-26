import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        long tich = 1;
        for(int i =0;i < n;i++){
            tich *= 1l * a[i] % mod;
            tich %= mod;
        }
        System.out.print(tich);
    }
}
