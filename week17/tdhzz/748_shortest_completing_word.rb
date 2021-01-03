# @param {String} license_plate
# @param {String[]} words
# @return {String}
def shortest_completing_word(license_plate, words)
  attr = []
  hash = Hash.new(0)
    
    license_plate.chars.each do |char|
      next if !('a'.ord..'z'.ord).include?(char.downcase.ord)  
      hash[char.downcase] += 1
    end
    
    words.each do |word|
      hash.keys.each_with_index do |key, i|
        break unless hash[key] <= word.count(key)
        attr << word if i == hash.length - 1
      end
    end
    
    shortest = attr.sort{|a,b| a.length <=> b.length}.first
    
    attr.select{|word| word.length == shortest.length}.first
end
