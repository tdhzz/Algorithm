def find_error_nums(nums)
  missing = nil  
  extra = nil
  num_hash = nums.reduce(Hash.new(0)) { |hash, val| hash[val] += 1; hash }

  nums.each.with_index do |num, i|
    i = i + 1  
    extra = num if num_hash[num] > 1
      
    unless num_hash.has_key?(i)
      missing = i    
    end
      
    return [ extra, missing ] if extra && missing  
  end    
end
