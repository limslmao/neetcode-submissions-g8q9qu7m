class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int res = 0;
        int l = 0;

        for(int r = 0;r<s.length();r++){
            count[s.charAt(r)-'A']++;

            int max = 0;
            for(int val:count){
                if(val>max){
                    max = val;
                }
            }

            while((r-l+1) - max > k){
                count[s.charAt(l) - 'A']--;
                l++;

                max = 0;
                for(int val:count){
                    if(val>max){
                        max = val;
                    }
                }
            }

            res = Math.max(res, r-l+1);
        }

        return res;
    }
}
