# @param {Integer} n
# @return {Integer[]}
def get_no_zero_integers(n)
    (1...n).each do |i|
        a,b = i,n-i
        return [a,b] if no_zero(a) && no_zero(b)
    end
end

def no_zero(x)
    x.digits.find_index(0).nil?
end
