import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(long x, long n, long m) {
        long ans = 1;
        while(n > 0){
            if(n % 2 == 1){
                ans = (ans * x) % m;
                n--;
            }
            else{
                x = (x * x) % m;
                n = n/2;
            }
        }
        return (int)ans;
    }
}