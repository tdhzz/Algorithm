# @param {String} s
# @return {Boolean}
def repeated_substring_pattern(s)
  return false if s.nil? || s.empty?
  (s + s)[1..-2].include?(s)
end
