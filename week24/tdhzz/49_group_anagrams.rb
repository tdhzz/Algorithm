# @param {String[]} strs
# @return {String[][]}
def group_anagrams(strs)
    anagrams = Hash.new {|h, k| h[k] = []}
    
    strs.each do |str|
        sorted = str.chars.sort
        anagrams[sorted] << str
    end
    
    anagrams.values
end
