# @param {Integer} n
# @return {Boolean}
def is_power_of_two(n)
  n & (n - 1) == 0 && n > 0
end
