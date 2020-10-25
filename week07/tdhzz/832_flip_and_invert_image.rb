# @param {Integer[][]} a
# @return {Integer[][]}
def flip_and_invert_image(a)
  a.map{|row| row.reverse}.map{|row| row.map{|i| i=(i==1?0:1)}}
end
