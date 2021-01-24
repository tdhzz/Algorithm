# @param {Integer[]} arr
# @return {Boolean}
def can_make_arithmetic_progression(arr) 
    arr.sort!
    start_index = 0
    current_diff = arr[start_index + 1] - arr[start_index]    
    while(start_index < arr.length - 1)
       if (arr[start_index + 1] - arr[start_index] != current_diff) 
           return false
       end
        start_index += 1     
    end
    return true
end
