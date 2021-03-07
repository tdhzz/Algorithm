# @param {Integer[]} t
# @return {Integer[]}
def daily_temperatures(t)
    wait = [0] * (t.length)
    previous_index = [0]
    t.each_with_index do |temp, idx|
        next if idx == 0
        while !previous_index.empty? && temp > t[previous_index[-1]]
            wait[previous_index[-1]] = idx - previous_index[-1]
            previous_index.pop
        end 
        previous_index << idx
    end
    wait
end
