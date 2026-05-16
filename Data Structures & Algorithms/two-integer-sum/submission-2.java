class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> s = new HashMap<>();
        int[] a= new int[2];
        for(int i=0;i<nums.length;i++){
            s.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(target-nums[i])){
                if(s.get(target-nums[i])!=i){
                    a[0]=i;
                    a[1]=s.get(target-nums[i]);
                    return a;
                }
            }
        }
        return a;
    }
}
