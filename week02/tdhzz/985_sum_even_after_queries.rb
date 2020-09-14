# @param {Integer[]} a
# @param {Integer[][]} queries
# @return {Integer[]}
def sum_even_after_queries(a, queries)
  ans = []
  return ans if queries.empty?

  evensum = a.select(&:even?).reduce(:+) || 0

  queries.each do |n, i|
    evensum -= a[i] if a[i].even?
    a[i] += n
    evensum += a[i] if a[i].even?
    ans << evensum
  end
  ans
end
