# @param {Integer} row_index
# @return {Integer[]}
def get_row(row_index)
  result = [1]
  (1..row_index).each do |k|
    result << result.last * (row_index - k + 1) / k
  end
  result
end
