class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        n = len(mat)
        power = [sum(line) for line in mat]
        ans = list(range(n))
        ans.sort(key=lambda i: (power[i], i))
        return ans[:k]