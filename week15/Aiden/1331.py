class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        sortedArr = sorted(list(set(arr)))   # 去重
        hashmap = {}
        for i,ele in enumerate(sortedArr):
            hashmap[ele]  = i + 1
        return [hashmap[i] for i in arr]