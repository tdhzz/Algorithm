# @param {Integer[]} a
# @return {Integer}
# @param {Integer[]} a
# @return {Integer}
def subarray_bitwise_o_rs(a)
    ans = Set[]
    cur = Set[0]
    a.each do |n|
        cur2 = Set[]
        cur.each { |m| cur2.add(n | m) }
        cur2.add(n)
        cur = cur2
        ans.merge(cur)
    end
    ans.length
end
