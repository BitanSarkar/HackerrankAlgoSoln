import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int count1[] = new int[1000];
        int count2[] = new int[1000];
        for(int i = 0; i < n; i++){
            A[i] = ob.nextInt();
            count1[A[i]-1]++;
        }
        for(int i = 0; i < 1000; i++)
            if(count1[i] == 0)
                count1[i] = 99999;
        for(int i = 0; i < n; i++){
            B[i] = ob.nextInt();
            count2[B[i]-1]++;
        }
        for(int i = 0; i < 1000; i++)
            if(count2[i] == 0)
                count2[i] = 99999;
        int flag = 0;
        int ctr = 0;
        for(int i = 0; i < 1000; i++){
            if(count1[i] != 99999 && count2[i] != 99999){
                if(count1[i] == count2[i]){
                    ctr+=count1[i];
                }
                else if(count1[i] > count2[i]){
                    ctr+=count2[i];
                    flag = 1;
                }
                else{
                    ctr+=count1[i];
                    flag = 1;
                }
            }
        }
        if(flag == 1)
            ctr+=1;
        if(flag == 0){
            ctr-=1;
            for(int i = 0; i < 1000; i++){
                if(count1[i] == 99999 && count2[i] == 1){
                    ctr+=2;
                    break;
                }
                if(count2[i] == 99999 && count1[i] == 1){
                    ctr+=2;
                    break;
                }
            }
        }
        System.out.println(ctr);
    }
}
