# @param {Integer} n
# @param {Integer} start
# @return {Integer}
def xor_operation(n, start)
  (0...n).map{|x| start+x*2}.reduce(&:^)
end