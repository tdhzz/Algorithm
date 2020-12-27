# @param {Integer} n
# @param {Integer[][]} trust
# @return {Integer}
def find_judge(n, trust)
    return 1 if trust.empty? && n == 1
    
    cache = Array.new(n + 1, 0)
    trust.each do |(person, trusts_to)|
        cache[person] = cache[person] - 1
        cache[trusts_to] = cache[trusts_to] + 1
    end
    
    cache.index(n - 1) || -1
end
