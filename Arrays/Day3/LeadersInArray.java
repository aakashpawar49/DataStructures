class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxRight = Integer.MIN_VALUE;

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] > maxRight){
                leaders.add(nums[i]);
                maxRight = nums[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
