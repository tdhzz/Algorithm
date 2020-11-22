# @param {Integer[][]} mat
# @param {Integer} k
# @return {Integer[]}
def k_weakest_rows(mat, k)
  c_loc_arr = []
  new_arr = []
  hash = {}
 
  mat.each.with_index do |arr, idx|
    arr.index(0) != nil ?  c_loc_arr <<  arr.index(0) : c_loc_arr << arr.length 
  end

  (0...c_loc_arr.length).each do |row|
    hash[row] = c_loc_arr[row]
  end

  sorted_arr = hash.sort_by {|k, v| v}
  sorted_arr.each { |arr| new_arr << arr[0]}

  new_arr[0...k]  
end
