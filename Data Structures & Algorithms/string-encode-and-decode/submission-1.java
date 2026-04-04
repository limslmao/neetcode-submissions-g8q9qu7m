class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        
        for(String word :strs){
            int len = word.length();
            str.append(len);
            str.append("#");
            str.append(word);
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            StringBuilder num = new StringBuilder();
            while (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
                i++;
            }
            int length = Integer.parseInt(num.toString());
            i++;
            list.add(str.substring(i, i + length));
            i += length - 1;
        }

        return list;
    }
}
