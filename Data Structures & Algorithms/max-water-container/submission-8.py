class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxAmount = 0
        l = 0
        r = len(heights) - 1
        
        while l<r:
            area = (r - l) * min(heights[l], heights[r])
            maxAmount = max(area, maxAmount)
            if heights[l] < heights[r]:
                l += 1
            else:
                r -= 1
        
        return maxAmount