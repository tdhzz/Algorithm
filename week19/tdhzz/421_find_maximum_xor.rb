# @param {Integer[]} nums
# @return {Integer}
def find_maximum_xor(nums)
  root = TrieNode.new

  nums.each do |num|
    node = root

    31.downto(0) do |j|
      if num & 2**j != 0
        unless node.one
          node.one = TrieNode.new
        end
        node = node.one
      else
        unless node.zero
          node.zero = TrieNode.new
        end
        node = node.zero
      end
    end
  end

  result = 0

  nums.each do |num|
    node = root
    tmp_val = 0

    31.downto(0) do |j|
      tmp = num & 2**j

      if node.one && node.zero
        unless tmp.zero?
          node = node.zero
        else
          node = node.one
        end

        tmp_val += 2**j
      else
        if (node.zero && !tmp.zero?) || (node.one && tmp.zero?)
          tmp_val += 2**j
        end

        node = node.one || node.zero
      end
    end

    result = [result, tmp_val].max
  end

  result
end

class TrieNode
  def initialize
    @one = nil
    @zero = nil
  end

  attr_accessor :one, :zero
end