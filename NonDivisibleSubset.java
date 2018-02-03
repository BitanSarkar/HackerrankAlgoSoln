import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int cnts[] = new int[k];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            cnts[a[a_i]%k]++;
        }
        int cnt = 0;
        for (int i=1;i<=k/2;i++) {
            if (2*i!=k) {
                cnt += Math.max(cnts[i],cnts[k-i]);
            }
        }
        if (k%2==0) {
            if (cnts[k/2]>0) {
                cnt ++;
            }
        }
        if (cnts[0]>0) {
            cnt ++;
        }
        System.out.println(cnt);
        
    }
}
