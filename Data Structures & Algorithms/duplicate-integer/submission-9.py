class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        s = set()
        for i, n in enumerate(nums):
            leng = len(s)
            s.add(n);
            if len(s) == leng:
                return True
        
        return False