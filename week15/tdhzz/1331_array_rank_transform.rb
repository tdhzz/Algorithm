# @param {Integer[]} arr
# @return {Integer[]}
def array_rank_transform(arr)
    hsh = {}
    arr.sort.uniq.each_with_index{|value,index|
      hsh[value] = index 
    }
    arr.map{|x| hsh[x] + 1}
end
