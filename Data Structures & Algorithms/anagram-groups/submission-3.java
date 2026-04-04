class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> resultMap = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            int arrayHash = Arrays.hashCode(count);
            resultMap.putIfAbsent(arrayHash, new ArrayList<>());
            resultMap.get(arrayHash).add(s);
        }

        return new ArrayList<>(resultMap.values());
    }
}
