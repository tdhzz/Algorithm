# @param {Integer[]} a
# @return {Boolean}
def is_monotonic(a) 
   return true if a.length <= 1

    (1..a.length - 1).each do |i|
      if a[i] < a[i-1]
        a.reverse!
          break
        end
    end
    correct_ascending(a)
end

def correct_ascending(a)
    (1..a.length - 1).each do |i|
      return false if a[i] < a[i-1]
    end
    true
end
