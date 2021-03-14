# @param {Integer[]} nums
# @return {Integer}
def largest_perimeter(a)
  a.sort.reverse.each_cons(3).each do |(x,y,z)| 
    return x+y+z if y+z > x
  end
  0
end
