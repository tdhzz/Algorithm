# @param {String} s
# @param {Integer[]} indices
# @return {String}
def restore_string(s, indices)
    ret_string="0"*s.length
    (0...s.length).each { |i| ret_string[indices[i]]=s[i] }
    ret_string
end
