import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i = 0;
        int j = 0;

        int[] res = new int[n + m];
        int idx = 0;

        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                res[idx++] = arr1[i++];
            }
            else{
                res[idx++] = arr2[j++];
            }
        }
        while(i < m){
            res[idx++] = arr1[i++];
        }
        while(j < n){
            res[idx++] = arr2[j++];
        }
        return res;
    }
}
