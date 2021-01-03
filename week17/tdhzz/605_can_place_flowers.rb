# @param {Integer[]} flowerbed
# @param {Integer} n
# @return {Boolean}
def can_place_flowers(flowerbed, n)
    planted = 0
    (0...flowerbed.size).each do |i|
        one =  i-1 == -1 || 0 == flowerbed[i-1]
        two =  i+1 == flowerbed.size || 0 == flowerbed[i+1]
        if one && two
            planted += 1 if 0 == flowerbed[i]
            return true if planted >= n
            flowerbed[i] = 1
        end
    end
    planted >= n
end
