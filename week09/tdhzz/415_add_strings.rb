# @param {String} num1
# @param {String} num2
# @return {String}
def add_strings(num1, num2)
  "#{str_to_i(num1) + str_to_i(num2)}"
end

def str_to_i(str)
  int = 0
  str.split("").each_with_index do |n, i|
    magnitude = (str.length - i - 1)
    int += n.to_i * 10**magnitude
  end
  int
end

