class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        strsMap = collections.defaultdict(list)

        for s in strs:
            arr = [0] * 26
            for c in s:
                index = ord(c) - ord('a')
                arr[index] += 1
            
            strsMap[tuple(arr)].append(s)

        return list(strsMap.values())