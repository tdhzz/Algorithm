class Solution:
    def arrangeCoins(self, n: int) -> int:
        value = n
        while abs(value*(value+1)/2 - n) > 0.01:
            value = (value*value + n*2) / (value*2 + 1)
        return int(value)
