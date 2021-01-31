class Solution:
    def firstUniqChar(self,s):
        dct = dict()
        for c in s:
            dct[c] = dct.get(c,0) +1  
        for i, c in enumerate(s):
            if dct[c] == 1:
                return i
        return -1
