class Solution:
    def largeGroupPositions(self, S: str) -> List[List[int]]:
        if len(S) < 3:
            return []
        a = 0
        b = 0
        result = []
        while b < len(S):
            if S[b] == S[a]:
                b += 1
            else:
                if b-a >= 3:
                    result.append([a, b-1])
                    a = b
                else:
                    a = b
                    b += 1
        if b-a >= 3:
            result.append([a, b-1])
        return result