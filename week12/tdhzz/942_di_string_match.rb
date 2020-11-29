# @param {String} s
# @return {Integer[]}
def di_string_match(s)
  min = 0
  max = s.length
  arr = []
  s.each_char do |i|
    if i == "I"
      arr << min && min += 1
    elsif i == "D"
      arr << max && max -= 1
    end
  end
  arr << max
end
