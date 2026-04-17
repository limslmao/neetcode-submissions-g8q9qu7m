class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        strsMap = collections.defaultdict(list)

        for st in strs:
            arr = [0] * 26
            for char in st:
                index = ord(char) - ord('a')
                arr[index]+=1
            # 放Map, index是陣列, value是str陣列, 如果有一樣的就加長str陣列
            strsMap[tuple(arr)].append(st)


        return list(strsMap.values())
        