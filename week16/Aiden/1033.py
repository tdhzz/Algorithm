class Solution:
    def numMovesStones(self, a: int, b: int, c: int) -> List[int]:
        x,y,z = sorted((a,b,c))
        return [0 if x+2==y+1==z else (2 if y-x>2 and z-y>2 else 1),z-2-x]