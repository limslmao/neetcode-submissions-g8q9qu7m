class Solution {
    public int longestConsecutive(int[] nums) {
        // put in hashset
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        // use the first to last element to get from set, and to see if there's other num in set?
        int count = 0;
        int temp = 0;

        for(int i =0; i<nums.length;i++){
            int firstNum = nums[i];
            while(set.contains(firstNum)){
                firstNum++;
                temp++;
            }
            count = Math.max(count,temp);
            temp = 0;
        }

        return count;
    }
}
