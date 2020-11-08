=begin
# Definition for Employee.
class Employee
    attr_accessor :id, :importance, :subordinates
    def initialize( id, importance, subordinates)
        @id = id
        @importance = importance
        @subordinates = subordinates
    end
end
=end

# @param {Employee} employees
# @param {Integer} id
# @return {Integer}
def get_importance(employees, id)
    find_employees = [id]
    total_imp = 0
    while !find_employees.empty?
        this_one=find_employees.shift
        employees.each do |emp_rec|
            if this_one==emp_rec.id
                total_imp += emp_rec.importance
                find_employees.concat(emp_rec.subordinates)
                break
            end
        end
    end
    return total_imp
end
