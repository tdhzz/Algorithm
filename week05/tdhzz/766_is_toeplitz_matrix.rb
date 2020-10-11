# @param {Integer[][]} matrix
# @return {Boolean}
def is_toeplitz_matrix(matrix)
  (0...matrix.size - 1).each do |m|
    (0...matrix[m].size - 1).each do |n|
    return false if matrix[m][n] != matrix[m+1][n+1]
    end
  end
  true
end
