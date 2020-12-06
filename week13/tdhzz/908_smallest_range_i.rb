def smallest_range_i(a, k)
    t = 2*k
    min = a.min
    max = a.max
    l = max-min
    if l<=t
        return 0
    end
    return max-min-t;
end
