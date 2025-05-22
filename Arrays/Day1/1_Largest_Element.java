// Given an array of integers nums, return the value of the largest element in the array

//Approaches:
// Sorting - O(N*log(N))
// Recursive - O(N)

class Solution {
    public int largestElement(int[] nums) {
        int max = nums[0];
        int i = 0;
        while( i < nums.length){
            if(nums[i]>max){
                max = nums[i];
            }
            i++;
        }
        return max;
    }
}
