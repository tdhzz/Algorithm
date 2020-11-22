class Solution:
    def getRow(self, k: int) -> List[int]:
        result = [1] * (k+1)
        for i in range(2, k+1):
            for j in range(1, i):
                index = i-j
                result[index] = result[index] + result[index-1]
                
        return result