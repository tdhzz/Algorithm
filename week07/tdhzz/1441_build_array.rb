# @param {Integer[]} target
# @param {Integer} n
# @return {String[]}

def build_array(target, n)
    count = 0
    (1..n).reduce([]) do |arr, i|
        arr << "Push"
        count += 1
        if !target.include?(i)
            arr << "Pop" 
            count -= 1
        end
        return arr if count == target.length
        arr
    end
end
