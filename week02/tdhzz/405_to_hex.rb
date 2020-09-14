# @param {Integer} num
# @return {String}
def to_hex(num)
  return '0' if num.zero?
  count = 0
  res = ''
  a = %w[0 1 2 3 4 5 6 7 8 9 a b c d e f]
  while num != 0 && count < 8
    res += a[num & 0xf]
    num /= 16
    count += 1
  end
  res.reverse
end
