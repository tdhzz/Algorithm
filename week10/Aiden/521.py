class Solution:
    def findLUSlength(self, a: str, b: str) -> int:
        if a == b:
            return -1
        n = len(a)
        m = len(b)
        if len(a) != len(b):
            return n if n>m else m
        return n