import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] nums, int n) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for(int i:nums){
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
			if(entry.getValue() > Math.floor(n/2)) return entry.getKey();
		}
		return -1;
	}
}