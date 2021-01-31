# @param {String[]} words
# @param {String} chars
# @return {Integer}
def count_characters(words, chars)
    result = 0
    chars_count = to_count_hash(chars)
    words.each do |word|
      word_count = to_count_hash(word)
      result += word.length unless word_count.any? {|key,count| count > chars_count[key] }
    end
    result
end

def to_count_hash(input)
    Hash.new(0).tap {|h| input.split('').each {|e| h[e] += 1}}
end

