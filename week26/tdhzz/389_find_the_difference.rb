# @param {String} s
# @param {String} t
# @return {Character}
def find_the_difference(s, t)
    s_new= s.chars.sort.join
    t_arr = t.chars.sort
    t_arr.each_with_index do |x,i|
        return x if x != s_new[i]
    end
end
