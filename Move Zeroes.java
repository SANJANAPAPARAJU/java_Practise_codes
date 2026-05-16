//. Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
       int index=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[index]=nums[i];
            index++;
        }
       }
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
       
        }
        }

//in this we are using index to palce the nonzero element in the place of index number. later we fill 0 after index value 
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
