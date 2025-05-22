// Second Largest Element

//Approaches:
// 1. Brute- Sorting (only if no duplicates) - O(N log N)
// 2. Traversal usng 2 pointers - O(N)

class Solution {
    public int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }
}