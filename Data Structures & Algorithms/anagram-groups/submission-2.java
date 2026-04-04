class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> result = new ArrayList<>();
        Map<Integer, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            int arrayHash = Arrays.hashCode(count);

            if (map.containsKey(arrayHash)) {
                map.get(arrayHash).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(arrayHash, list);
            }
        }

        for (Map.Entry<Integer, List<String>> e : map.entrySet()) {
            result.add(e.getValue());
        }

        return result;
    }
}
