class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int d = target - n;
            if(map.get(d)!=null){
                return new int[] {map.get(d), i};
            }else{
                map.put(n, i);
            }
        }
        return new int[] {0,0};
    }
}
