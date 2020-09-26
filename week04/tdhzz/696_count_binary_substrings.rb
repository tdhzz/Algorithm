# @param {String} s
# @return {Integer}
def count_binary_substrings(s)
  
  res, cur, pre = 0, 0, 0

  (0..s.size - 1).each do |i|
    if s[i] == s[i - 1]
      cur += 1
    else
      res += [cur, pre].min
      pre = cur
      cur = 1
    end
  end

  res + [cur, pre].min

end
