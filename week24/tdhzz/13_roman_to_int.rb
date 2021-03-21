# @param {String} s
# @return {Integer}
def roman_to_int(s)
    h = {'I' => 1, 'V' => 5, 'X' => 10, 'L' => 50, 'C' => 100, 'D' => 500, 'M' => 1000}
    result = 0
    prev = 0
    s.each_char do |c|
        v = h[c]
        prev < v ? result -= prev : result += prev
        prev = v
    end
    result + prev
end
