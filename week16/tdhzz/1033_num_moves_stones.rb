# @param {Integer} a
# @param {Integer} b
# @param {Integer} c
# @return {Integer[]}
def num_moves_stones(a, b, c)
    min = 2
    min = 1 if (a-b).abs<=2 or (a-c).abs<=2 or (b-c).abs<=2
    min = 0 if [a,b,c].max - [a,b,c].min == 2
    max = [a,b,c].max - [a,b,c].min - 2
    [min,max]
end
