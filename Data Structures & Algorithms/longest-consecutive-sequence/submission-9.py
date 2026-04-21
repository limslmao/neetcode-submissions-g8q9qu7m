class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        ## 放進hashmap
        # 如果-1沒有元素，那它就是頭
        # 計算每一顆頭多長，回傳最長的那顆頭

        numMap = {}
        headList = []
        maxi = 0

        for i , n in enumerate(nums):
            numMap[n] = i

        print(numMap)

        for n , i in enumerate(numMap):
            print("n, ", n)
            print("i, ", i)
            if i-1 not in numMap:
                headList.append(i)
        
        print("headlist", headList)

        for n in headList:
            length = 0
            while n in numMap:
                n += 1
                length += 1
            maxi = max(length, maxi)

        return maxi