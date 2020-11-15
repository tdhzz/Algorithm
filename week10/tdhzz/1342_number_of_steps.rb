# @param {Integer} num
# @return {Integer}
def number_of_steps (num, steps = 0)
    return steps if num.zero?
	
    new_num = num.even? ? num/2 : num - 1
    number_of_steps(new_num, steps + 1)
end
