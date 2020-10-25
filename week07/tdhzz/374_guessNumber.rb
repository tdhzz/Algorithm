# The guess API is already defined for you.
# @param num, your guess
# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
# def guess(num)

def guessNumber(n)
    return n if n == 1
    
    left_p = 0
    right_p = n
    
    while left_p <= right_p
        mid = (left_p + right_p) / 2

        case guess(mid)
        when 0
            return mid
        when -1
            right_p = mid - 1
        else
            left_p = mid + 1
        end
    end
end
