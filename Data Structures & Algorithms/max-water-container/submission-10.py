class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxAmount = 0
        l = 0
        r = len(heights) - 1

        while l<r:
            area = (r-l) * min(heights[l], heights[r])
            maxAmount = max(area, maxAmount)
            if heights[l] > heights[r]:
                r -= 1
            else:
                l += 1

        return maxAmount