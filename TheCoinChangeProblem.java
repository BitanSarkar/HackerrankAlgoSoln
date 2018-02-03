import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    static long arr[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        arr = new long[n+1];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        long ways = 0;
        arr[0] = 1;
        for(int i = 0; i < c.length; i++){
            for(int j = c[i]; j <= n; j++)
                arr[j] = arr[j] + arr[j-c[i]];
        }
        System.out.println(arr[n]);
    }
}
