class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> s = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(s.containsKey(t)){
                return new int[] {s.get(t),i};
            }
            s.put(nums[i],i);
        }
        return new int[0];
    }
}
