# @param {Integer} n
# @return {Boolean}
def has_alternating_bits(n)
  n < 3 || n%2 != n/2%2 && has_alternating_bits(n/2)
end