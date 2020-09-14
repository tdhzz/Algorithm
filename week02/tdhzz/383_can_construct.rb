# @param {String} ransom_note
# @param {String} magazine
# @return {Boolean}
def can_construct(ransom_note, magazine)
  hash = {}
  magazine.each_char { |chr| hash[chr] ? hash[chr] += 1 : hash[chr] = 1 }

  ransom_note.each_char do |char|
    return false unless hash[char]      
    hash[char] -= 1
    return false if hash[char] < 0
  end
  
  true
end
