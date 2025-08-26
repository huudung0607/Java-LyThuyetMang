import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void thayDoi(int []a, int n){
        for(int i = 0; i < n;i++){
            a[i] *= 2;
        }
    }
    public static void in(int []a, int n){
        for(int i = 0;i < n;i++){
            System.out.print(a[i] + " ");
        }
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        thayDoi(a,n);
        in(a,n);
    }
}
