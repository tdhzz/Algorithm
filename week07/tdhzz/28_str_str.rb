# @param {String} haystack
# @param {String} needle
# @return {Integer}
def str_str(haystack, needle)
  return -1 unless haystack.include? needle
  return 0 if needle.empty?
  
  haystack.chars.each_with_index do |str, i|
    if str == needle[0]
      if haystack[i, needle.length] == needle
        return i
      end
    end
  end
end
