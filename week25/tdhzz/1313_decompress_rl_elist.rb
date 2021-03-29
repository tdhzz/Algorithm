def decompress_rl_elist(nums, pair = 0, n = [])
    return n.flatten.compact if nums[pair..pair + 1].empty?   
    n[pair] = Array.new(nums[pair..pair + 1][0], nums[pair..pair + 1][1])
    decompress_rl_elist(nums, pair + 2, n)
end
