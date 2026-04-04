class Solution {
    public int longestConsecutive(int[] nums) {
        // put in hashset
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        // use the first to last element to get from set, and to see if there's other num in set?
        int count = 0;
        for(int num : nums){
            int temp = 0;
            if(!set.contains(num-1)){
                int length = 0;
                while(set.contains(num + length)){
                    length++;
                }
                count = Math.max(count,length);
            }  
            
        }
        return count;
    }
}
