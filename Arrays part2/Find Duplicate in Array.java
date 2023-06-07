import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> nums, int n){
        int l = 0;
        int r = n;

        while(l < r){
            int mid = l + (r - l)/2;
            int cnt = 0;
            for(int i=0;i<n;i++){
                if(nums.get(i) <= mid) cnt++;
            }

            if(cnt <= mid){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}
