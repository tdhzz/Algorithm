# @param {String} s
# @return {Integer}
def num_splits(s)
  return 0 if s.length < 2
  count = 0
  left_distinct = 0
  right_distinct = s.chars.uniq.length
  hash = {}

  (0..s.length).each { |i| hash[s[i]].nil? ? hash[s[i]] = [i,i] : hash[s[i]][1] = i }
  (1..s.length).each do |i|
    left_distinct += 1 if hash[s[i-1]][0] == i-1
    right_distinct -= 1 if hash[s[i-1]][1] == i-1
    count += 1 if left_distinct == right_distinct
  end
  count
end
