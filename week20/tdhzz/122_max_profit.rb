# @param {Integer[]} prices
# @return {Integer}
  def max_profit(prices)
    return 0 if prices.count < 2

    differences = (1..prices.count-1).reduce([]) {|ar, i| ar << (prices[i] - prices[i-1]) }

    differences.select{|num| num > 0}.reduce(:+) || 0
  end
