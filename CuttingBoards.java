import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void reverse(int[] input) {
    int last = input.length - 1;
    int middle = input.length/2;
    for (int i = 0; i < middle; i++) {
      int temp = input[i];
      input[i] = input[last - i];
      input[last - i] = temp;
    }
  }
    static int boardCutting(int[] cost_y, int[] cost_x) {
        Arrays.sort(cost_y);
        reverse(cost_y);
        Arrays.sort(cost_x);
        reverse(cost_x);
        long x = 1; 
        long y = 1;
        long sum = 0;
        int i_x = 0;
        int i_y = 0;
        while(i_x<cost_x.length && i_y<cost_y.length){
            if(cost_x[i_x] > cost_y[i_y]){
                sum=(sum+cost_x[i_x]*y)%1000000007;
                x++;
                i_x++;
            }
            else{
                sum = (sum+cost_y[i_y]*x)%1000000007;
                y++;
                i_y++;
            }
        }
        if(i_y < cost_y.length){
            for(int i = i_y; i < cost_y.length; i++){
                sum = (sum+cost_y[i]*x)%1000000007;
            }
        }
        if(i_x < cost_x.length){
            for(int i = i_x; i < cost_x.length; i++){
                sum=(sum+cost_x[i]*y)%1000000007;
            }
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] cost_y = new int[m-1];
            for(int cost_y_i = 0; cost_y_i < m-1; cost_y_i++){
                cost_y[cost_y_i] = in.nextInt();
            }
            int[] cost_x = new int[n-1];
            for(int cost_x_i = 0; cost_x_i < n-1; cost_x_i++){
                cost_x[cost_x_i] = in.nextInt();
            }
            int result = boardCutting(cost_y, cost_x);
            System.out.println(result);
        }
        in.close();
    }
}
