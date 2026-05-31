class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sArr = [0] * 26
        tArr = [0] * 26

        for charS, charT in zip(s,t):
            sOrd = ord(charS) - ord('a')
            sArr[sOrd] += 1
            tOrd = ord(charT) - ord('a')
            tArr[tOrd] += 1

        return sArr == tArr