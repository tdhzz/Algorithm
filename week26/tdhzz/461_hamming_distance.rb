# @param {Integer} x
# @param {Integer} y
# @return {Integer}
def hamming_distance(x, y)
  ("%b" % (x^y)).count('1')
end
