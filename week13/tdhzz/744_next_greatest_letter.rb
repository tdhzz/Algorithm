# @param {Character[]} letters
# @param {Character} target
# @return {Character}
def next_greatest_letter(letters, target)
    answer = letters.select{|x| x > target}.min
    answer ? answer : letters.min
end
