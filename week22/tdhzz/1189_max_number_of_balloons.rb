# @param {String} text
# @return {Integer}
def max_number_of_balloons(text)
  h = {}
  "balloon".each_char { |c| h[c] = 0 }
  
  text.each_char do |c|
    h[c] += 1 if h[c]
  end
  h['l'] = h['l'] / 2
  h['o'] = h['o'] / 2
  h.values.min
end
