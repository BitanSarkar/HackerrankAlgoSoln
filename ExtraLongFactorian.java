import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        BigInteger pr = new BigInteger("1");
        int n = ob.nextInt();
        for(int i = 2; i <= n; i++)
            pr = pr.multiply(new BigInteger(Integer.toString(i)));
        System.out.println(pr);
    }
}
