# @param {Integer[]} numbers
# @param {Integer} target
# @return {Integer[]}
def two_sum(numbers, target)
    be = 0
    en = numbers.length - 1
    
    while be < en
        cur = numbers[be] + numbers[en]
        if cur == target
            return [be + 1, en + 1]
        elsif cur < target
            be += 1
        else
            en -= 1
        end
    end
end
