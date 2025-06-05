class Solution {
    public int search(int[] nums, int target){
        int head = 0, tail = nums.length-1;

        while(head<=tail){
            int middle = head + (tail - head) / 2;
            if(nums[middle] == target) return middle;
            else if(nums[middle] < target) head = middle + 1;
            else tail = middle - 1; 
        }
        return -1;
    }
}
