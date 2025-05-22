// Left Rotate Array by One
// Approaches:
// 1. New Array - O(N)
// 2. Left shift and store first element - O(N)

class Solution {
    public void rotateArrayByOne(int[] nums) {
        int first = nums[0];
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[length - 1] = first;
    }
}