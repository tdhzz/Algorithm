# @param {String} a
# @param {String} b
# @return {Integer}
def find_lu_slength(a, b)
    return -1 if a == b
    a.length != b.length ? [a.length, b.length].max : a.length
end
