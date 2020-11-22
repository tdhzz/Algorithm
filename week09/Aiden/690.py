class Solution:
    def getImportance(self, employees: List['Employee'], id: int) -> int:
        hashmap = {}
        for employee in employees:
            hashmap[employee.id] = employee
        def Recursion(id):
            sum = hashmap[id].importance
            for subordinate in hashmap[id].subordinates:
                sum += Recursion(subordinate)
            return sum
        return Recursion(id)