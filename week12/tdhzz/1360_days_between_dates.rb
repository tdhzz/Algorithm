# @param {String} date1
# @param {String} date2
# @return {Integer}
require "date"
def days_between_dates(date1, date2)
  (DateTime.strptime(date1, "%Y-%m-%d") - DateTime.strptime(date2, "%Y-%m-%d")).to_i.abs
end
