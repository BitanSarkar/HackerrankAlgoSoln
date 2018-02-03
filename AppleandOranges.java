import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int applectr = 0;
        int orangectr = 0;
        for(int i=0; i < m; i++)
            applectr+=((apple[i]>=(s-a) && apple[i]<=(t-a))?1:0);
        for(int i=0; i < n; i++)
            orangectr+=((orange[i]>=(s-b) && orange[i]<=(t-b))?1:0);
        System.out.println(applectr+"\n"+orangectr);
    }
}
