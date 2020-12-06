def num_identical_pairs(nums)
    pairs = 0
    
    nums.each_with_index do |_, i|
        nums.length.downto(0) do |j|
            pairs += 1 if nums[i] == nums[j] && i < j
        end
    end

    return pairs
end
