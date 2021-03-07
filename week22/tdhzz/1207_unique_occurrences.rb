# @param {Integer[]} arr
# @return {Boolean}
def unique_occurrences(arr)
    hash = Hash.new(0)
    arr.each do |n|
        hash[n] += 1
    end 
       a = hash.values.to_a
    return false if a == a.uniq!
    true
end
