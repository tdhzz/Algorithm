# @param {String} s
# @return {Integer}
def min_insertions(s)
    left = right = 0
    s.gsub("))", "}").each_char do |i|
      case i
      when "("
        left += 1
      when ")"
        if left > 0
          right += 1; left -= 1 
        else
          right += 2
        end
      else
        left > 0 ? left -= 1 : right += 1
      end
    end
    right + ( left*2 )
end
