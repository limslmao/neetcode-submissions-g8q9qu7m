class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = "";
        for(int i = 0; i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            for(int j = 0; j<strs.length;j++)
            {
                
                char chDiff = strs[j].charAt(i);
                if(ch != chDiff){
                    return s;
                }
            }
            s += ch;
        }
        return s;
    }
}