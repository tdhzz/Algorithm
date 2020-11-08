# @param {Integer} n
# @return {Integer}

def arrange_coins(n)
    return 0 if n == 0
    
    stairs = 0
    while n >= 0 do
      n -= stairs + 1
      stairs += 1
    end
    n == 0 ? stairs : stairs - 1
end
