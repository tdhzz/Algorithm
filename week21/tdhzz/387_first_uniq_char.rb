def first_uniq_char(s)
    used_chars = []
    s.chars.each_with_index do |c, i|
        next if used_chars.include?(c) 
        return i if s.chars.count(c) == 1
        used_chars << c
    end
    -1
end
