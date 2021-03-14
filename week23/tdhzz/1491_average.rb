# @param {Integer[]} salary
# @return {Float}
def average(salary)
 (salary.inject(0, :+)-salary.max-salary.min)/(salary.size-2).to_f
end
