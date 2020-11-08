# The is_bad_version API is already defined for you.
# @param {Integer} version
# @return {boolean} whether the version is bad
# def is_bad_version(version):

# @param {Integer} n
# @return {Integer}
def first_bad_version(n)
  left = 1
  right = n
  while(right > left )
    middle = ((right - left) / 2) +  left
    if is_bad_version(middle)
        right = middle    
    else
        left = middle + 1
    end
  end 
  if left == right && is_bad_version(left)
    return left
  end
  return -1    
end
