import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Vector<Integer> v = new Vector<>();
        int max = -1;
        for(int i = n - 1;i >= 0 ;i--){
            if(a[i] > max){
                max = a[i];
                v.add(max);
            }
        }
        for(int i = v.size() - 1;i >= 0; i--){
            System.out.print(v.get(i) + " " );
        }
    }
}
