# @param {String[]} a
# @return {String[]}
def common_chars(array)
  array = array.map { |word| word.dup }
  first_word = array.shift.chars

  first_word.select do |char|
    array.all? { |word| word.sub!(char, '') }
  end
end
