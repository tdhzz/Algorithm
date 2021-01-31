class Solution:
    def getFolderNames(self, names: List[str]) -> List[str]:
        namesDic  = {}  ##存放每个文件的个数
        res = []  ##存放结果
        for name in names:
            if name not in namesDic: ##如果不再字典中，就直接加入结果集中
                res.append(name)
                namesDic[name]=1
            else:
                curName = name+"("+str(namesDic[name])+")"
                namesDic[name]+=1
                while curName in namesDic:
                    curName = name+"("+str(namesDic[name])+")"
                    namesDic[name]+=1
                res.append(curName)
                namesDic[curName]=1
        return res
