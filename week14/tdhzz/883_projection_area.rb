# @param {Integer[][]} grid
# @return {Integer}
def projection_area(grid)
    xy = grid.flatten.select{|x| x > 0}.size
    xz = grid.map{|x| x.max}.sum
    yz = grid.transpose.map{|x| x.max}.sum
    xy + xz + yz
end
