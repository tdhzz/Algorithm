# @param {String[][]} orders
# @return {String[][]}
def display_table(orders)

    h = {}
    s = {}
    orders.each do | _, t, i |
      s[i] = 1
      h[t.to_i] ||= Hash.new 0
      h[t.to_i][i] += 1
    end
    r = [['Table'] + (s = s.keys.to_a.sort)]
    h.to_a.sort.each do | k, h |
      r << [k.to_s]
      s.each { | k | r[-1] << h[k].to_s }
    end
    r
end
