//https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        //dutch national flag 
        int low = 0;
        int mid = 0;
        int hi = nums.length-1;
        while(mid <= hi){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, hi);
                hi--;
            }
        }
    }
    public void swap(int[] nums, int n1, int n2){
        int temp = nums[n2];
        nums[n2] = nums[n1];
        nums[n1] = temp;
    }
}