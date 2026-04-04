class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length() + "#" + s);
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int index = 0;
        

        String lenS = "";
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c != '#'){
                lenS += c;
                continue;
            }
            i++;
            int len = Integer.parseInt(lenS);
            
            String word = str.substring(i, i+len); 
            res.add(word);

            lenS = "";
            i+=len-1;
        }
 
        return res;
    }
}
