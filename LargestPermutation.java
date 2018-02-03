import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int arr[] = new int[n];
        int pos[] = new int[n+1];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
            pos[arr[i]] = i;
        }
        for(int i = 0; i < n && k>0; i++){
            if(arr[i] == n-i)
                continue;
            int t1 = pos[n-i];
            int t2 = pos[arr[i]];
            pos[n-i] = pos[arr[i]];
            pos[arr[i]] = t1;
            int t3 = arr[t1];
            arr[t1] = arr[t2];
            arr[t2] = t3;
            k--;
        }
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
