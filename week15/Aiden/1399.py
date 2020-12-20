class Solution:
    def countLargestGroup(self, n: int) -> int:
        d={}
        for i in range(1,n+1):
            k=0
            for j in str(i):
                k+=int(j)#转为字符串后得位数和
            if k in d:
                d[k]+=1
            else:
                d[k]=1
        return list(d.values()).count(max(d.values()))
