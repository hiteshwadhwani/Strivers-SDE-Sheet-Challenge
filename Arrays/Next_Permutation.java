//https://leetcode.com/problems/next-permutation/description/

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length -1;
        while(i-1 >=0 && nums[i-1] >= nums[i]){
            i--;
        }
        if(i == 0){
            Arrays.sort(nums);
        }
        else{
            // find num just greater than nums[i-1]
            for(int x=nums.length-1;x>=0;x--){
                if(nums[x] > nums[i-1]){
                    //swap and break
                    int temp = nums[x];
                    nums[x] = nums[i-1];
                    nums[i-1] = temp;
                    break;
                }
            }

            //sort array from i to n-1
            Arrays.sort(nums, i, nums.length);
        }
    }
}