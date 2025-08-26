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
        int cnt = 0;
        for(int i = 0;i < n;i++){
            if(a[i] % 2 == 0) cnt++;
        }
        System.out.print(cnt + " " + (n - cnt));
    }
}
