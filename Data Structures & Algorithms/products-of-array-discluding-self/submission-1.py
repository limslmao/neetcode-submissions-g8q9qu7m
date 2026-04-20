class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        zerocount = 0;
        zeroindex = 0;
        res = 1;

        for i, n in enumerate(nums):
            if n != 0:
                res *= n
            else:
                zerocount += 1
                zeroindex = i
            
            if zerocount > 1:
                return [0] * len(nums)
        
        resList = []
        if zerocount == 1: 
            resList = [0] * len(nums)
            resList[zeroindex] = res
            return resList
            


        for n in nums:
            if n != 0:
                resList.append(int(res / n))
            else:
                resList.append(res)

        return resList


        