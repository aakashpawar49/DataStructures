import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        Arrays.sort(result);

        return result;
    }
}