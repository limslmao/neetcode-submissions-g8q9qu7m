class Solution:
    def isPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1

        while l<r:
            while not s[l].isalnum() and l<r:
                print("not l,", s[l])
                l += 1
            while not s[r].isalnum() and l<r:
                print("not r, ", s[r])
                r -= 1
            if s[l].lower() != s[r].lower():
                print("sl:", s[l], " sr:", s[r])
                return False
            l += 1
            r -= 1
            
        return True