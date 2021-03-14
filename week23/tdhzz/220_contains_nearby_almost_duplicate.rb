# @param {Integer[]} nums
# @param {Integer} k
# @param {Integer} t
# @return {Boolean}
def heappush(pq, x)
  idx = pq.bsearch_index { |y| y >= x } || pq.size
  pq.insert(idx, x)
  idx
end

def heappop(pq, x)
  idx = pq.bsearch_index { |y| y >= x }
  pq.delete_at(idx)
end

def contains_nearby_almost_duplicate(nums, k, t)
  return false if k == 0
  n = nums.size
  pq = nums[0..k].sort
  return true if pq.each_cons(2).any? { |a, b| b - a <= t }
  (0..n - k - 2).each do |i|
    heappop(pq, nums[i])
    j = heappush(pq, nums[i + k + 1])
    return true if j > 0 && pq[j] - pq[j - 1] <= t || j < k && pq[j + 1] - pq[j] <= t
  end
  return false 
end
