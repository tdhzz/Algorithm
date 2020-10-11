# @param {String} date
# @return {Integer}
def day_of_year(date)
  arr = [0,31,28,31,30,31,30,31,31,30,31,30,31]
  year, month, day = date.split(?-).map(&:to_i)
  is_leap = ->x{ (0 == x%4 && 0 != x%100) || (0 == x%100 && 0 == x%400)}
  
  arr[2] = 29 if is_leap[year]
  arr[0...month].sum + day
end
