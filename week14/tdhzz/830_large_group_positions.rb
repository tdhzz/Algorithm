def large_group_positions(s)
    len = s.length
    curr_char = s[0]
    curr_start = 0
    output = []
    s.chars.each_with_index { |c, i|
        if curr_char != c
            output << [curr_start, i-1] if i - curr_start >= 3
            curr_char = c
            curr_start = i
        end
    }
    output << [curr_start, len-1] if((curr_char == s[len-1]) && (len - curr_start >= 3))
    output
end
