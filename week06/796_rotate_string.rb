# @param {String} a
# @param {String} b
# @return {Boolean}
def rotate_string(a, b)
    return false if a.length != b.length
    (0..a.length).each do |i|
      return true if a==b
      a=a[1..-1]+a[0]
    end
    false
end
