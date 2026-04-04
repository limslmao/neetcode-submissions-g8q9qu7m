class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            numsMap.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target-num;
            if(numsMap.containsKey(diff) && numsMap.get(diff)!=i){
                return new int[] {i, numsMap.get(diff)};
            }
        }

        return new int[] {0,0};
    }
}
