# @param {Integer} n, a positive integer
# @return {Integer}
def reverse_bits(n)
    2**(32-(n.to_s(2)).length())*n.to_s(2).reverse!.to_i(2)
end
