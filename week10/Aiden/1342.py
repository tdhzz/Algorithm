class Solution:
    def numberOfSteps (self, num: int) -> int:
        n = 0
        while num>0:
            if num == 0:
                return n
            elif num%2 ==0:
                num = num/2
                n += 1
            else:
                num = num-1
                n += 1
        return n