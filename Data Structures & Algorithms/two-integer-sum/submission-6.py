class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nMap = {}
        for i, n in enumerate(nums):
            diff = target - n
            if diff in nMap:
                return [nMap[diff], i]
                    
            nMap[n] = i

        return [0,0]