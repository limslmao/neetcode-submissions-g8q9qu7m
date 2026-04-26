class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxAmount = 0
        l = 0
        r = len(heights) - 1
        counter = 0

        while l < r:
            amount = (r - l) * min(heights[l], heights[r])
            maxAmount = max(amount, maxAmount)
            print("l: ",l, "r: ", r, "amount: ", amount)
            if heights[l] < heights[r]:
                l += 1
            else:
                r -= 1
            counter += 1

        return maxAmount;