# @param {Integer} num
# @return {String[]}
def read_binary_watch(num)
  output = []
  (0..11).each do |h|
    (0..59).each do |m|
      bits_count = 0
      if (h.to_s(2) + m.to_s(2)).count('1') == num
        output << "#{h}:#{sprintf("%02d", m)}"
      end
    end
  end
  output
end