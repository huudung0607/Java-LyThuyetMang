import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(a[0] + " " + a[n - 1]);
        System.out.println(a[1] + " " + a[n - 2]);
        if(n % 2 == 1) System.out.print(a[n/2]);
        else System.out.print("28tech");
    }
}
