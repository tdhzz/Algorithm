# @param {String} s
# @return {Integer}
def remove_palindrome_sub(s)
  return 0 if s.length == 0 
  s == s.reverse ? 1 : 2 
end
