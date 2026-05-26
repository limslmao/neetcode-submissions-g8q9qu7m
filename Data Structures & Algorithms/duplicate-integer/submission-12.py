class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        s = set()

        for i, n in enumerate(nums):
            s.add(n)
            
        if len(nums) == len(s):
            return False
            
        return True