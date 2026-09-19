class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)

        for st in strs:
            arr = [0] * 26
            for ch in st:
                num = ord(ch) - ord('a')
                arr[num] += 1
            res[tuple(arr)].append(st)

        return list(res.values())