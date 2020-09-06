=begin
 Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
Example:
Given num = 16, return true. Given num = 5, return false.
Follow up: Could you solve it without loops/recursion?
=end

module Main
# @param {Integer} num
# @return {Boolean}
  def is_power_of_four(num)
    if num <= 0
      return false
    end

    Math.log(num, 4).round(10) == Math.log(num, 4).round(10).to_i
  end
end