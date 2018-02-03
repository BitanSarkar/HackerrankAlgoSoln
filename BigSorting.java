import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int partition(String arr[], int low, int high)
    {
        String pivot = arr[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j].length() < pivot.length())
            {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j].length() == pivot.length() && pivot.compareTo(arr[j]) >= 0)
            {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
    static void sort(String arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            arr[unsorted_i] = in.next();
        }
        sort(arr,0,n-1);
        for(int i = 0;i<n;i++)System.out.println(arr[i]);
    }
}
