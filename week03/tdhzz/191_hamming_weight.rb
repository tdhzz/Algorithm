# @param {Integer} n, a positive integer
# @return {Integer}
def hamming_weight(n)
  n > 0 ? (n & 1) + hamming_weight(n >> 1) : 0
end
