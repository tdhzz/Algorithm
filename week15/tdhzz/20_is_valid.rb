# @param {String} s
# @return {Boolean}
def is_valid(s)
    return true if s.empty?
    queue = []
    t = { '}' => '{', ']' => '[', ')' => '(' }
    s.split("").each do |p|
        if t.values.include?(p)
            queue << p
        else
            return false if queue.pop != t[p]
        end
    end
    queue.empty?
end
