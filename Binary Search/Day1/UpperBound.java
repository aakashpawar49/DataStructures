class Solution {
    public int upperBound(int[] nums, int x) {
        int low = 0, high = nums.length;

        while(low<high){
            int mid = low + (high-low) / 2;
            if(nums[mid] <= x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}