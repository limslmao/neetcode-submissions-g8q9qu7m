class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) == 0 :
            return False
        if len(s) != len(t):
            return False

        sArr = [0] * 26
        tArr = [0] * 26

        for charS, charT in zip(s, t):
            sIndex = ord(charS) - ord('a')
            sArr[sIndex] += 1
            tIndex = ord(charT) - ord('a')
            tArr[tIndex] += 1

        return sArr == tArr