class Solution {
    public int majorityElement(int[] nums) {
        int numlen = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<numlen;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int k = entry.getKey();
            int v = entry.getValue();
            if(v > maxValue){
                maxValue = v;
                maxKey = k;
            }
        }

        return maxKey;
    }
}