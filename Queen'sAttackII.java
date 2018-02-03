import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Queen2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        int sum1_1 = rQueen - 1;
        int sum1_2 = (n-1) - sum1_1;
        int sum2_1 = Math.min(rQueen,n+1-cQueen)-1;
        int sum2_2 = (n-1)-Math.abs(n+1-cQueen-rQueen) - sum2_1;
        int sum3_1 = n-cQueen;
        int sum3_2 = (n-1) - sum3_1;
        int sum4_1 = Math.min(rQueen,cQueen)-1;
        int sum4_2 = (n-1)-Math.max(cQueen,rQueen)+Math.min(cQueen,rQueen) - sum4_1;
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            if(cObstacle == cQueen && rObstacle<rQueen && (rQueen-rObstacle-1)<sum1_1)
                sum1_1 = rQueen-rObstacle-1;
            else if(cObstacle == cQueen && rObstacle>rQueen && (rObstacle-rQueen-1)<sum1_2)
                sum1_2 = rObstacle-rQueen-1;
            else if(rQueen+cQueen == rObstacle+cObstacle && cObstacle>cQueen && (cObstacle-cQueen-1)<sum2_1)
                sum2_1 = cObstacle-cQueen-1;
            else if(rQueen+cQueen == rObstacle+cObstacle && cObstacle<cQueen && (-cObstacle+cQueen-1)<sum2_2)
                sum2_2 = cQueen - cObstacle - 1;
            else if(rObstacle == rQueen && cObstacle>cQueen && (cObstacle-cQueen-1)<sum3_1)
                sum3_1 = cObstacle-cQueen-1;
            else if(rObstacle == rQueen && cObstacle<cQueen && (cQueen-cObstacle-1)<sum3_2)
                sum3_2 = cQueen-cObstacle-1;
                else if(rQueen-rObstacle == cQueen-cObstacle){
                if(rObstacle<rQueen && (rQueen-rObstacle-1)<sum4_1)
                    sum4_1 = rQueen-rObstacle-1;
                if(rObstacle>rQueen && (-rQueen+rObstacle-1)<sum4_2)
                    sum4_2 = -rQueen+rObstacle-1;
            }
        }
        int sum = sum1_1+sum1_2+sum2_1+sum2_2+sum3_1+sum3_2+sum4_1+sum4_2;
        System.out.println(sum);
    }
}
