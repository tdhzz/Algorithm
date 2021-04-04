# @param {Integer} num
# @return {Integer}
def find_complement(num)
    complement = ~num
    size = num.to_s(2).length - 1
    
    size.downto(0).map { |n| complement[n] }.join.to_i(2)
end
