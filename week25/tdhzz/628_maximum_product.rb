# @param {Integer[]} nums
# @return {Integer}
def maximum_product(a)
    a.sort!()
    [a[0..2].reduce(:*),a[-3..-1].reduce(:*),a[0]*a[1]*a[-1]].max
end
