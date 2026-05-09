class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l = 0
        r = len(nums) - 1
        m = 0

        while l <= r:
            m = (l+r) // 2
            if nums[m] == target:
                return m

            if nums[l] <= nums[m]: # 表示左邊是嚴格遞增
                if nums[l] <= target < nums[m]:
                    r = m-1
                else:
                    l = m+1
            else: #右邊嚴格遞增
                if nums[m] < target <= nums[r]:
                    l = m+1
                else:
                    r = m-1

        return -1