import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(int n){
        if(n < 2) return false;
        for(int i= 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
            if(!check(a[i])){
                System.out.print(a[i] + " ");
            }
            else System.out.print(0 + " ");
        }
    }
}
