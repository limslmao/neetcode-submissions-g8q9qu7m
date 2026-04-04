class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];

        int l = 0;
        int r = nums.length - 1;

        while(l<=r){
            if(nums[l] < nums[r]){
                return Math.min(min, nums[l]);
            }

            int m = (l+r)/2;
            System.out.println(m);
            if(nums[l] <= nums[m]){
                min = Math.min(min, nums[m]);
                l = m+1;
            }else{
                min = Math.min(min, nums[m]);
                r = m-1;
            }
        }

        return min;
    }
}
