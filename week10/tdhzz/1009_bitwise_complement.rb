# @param {Integer} n
# @return {Integer}
def bitwise_complement(n)
  return (n == 0) ? 1 : ("1"*(Math::log(n,2).floor+1)).to_i(2) ^ n
end
