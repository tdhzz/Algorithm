package main

//请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
//
//
// 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2
//, 1, 1, 0, 0]。
//
// 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
// Related Topics 栈 哈希表
// 👍 668 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
type DailyTemperature struct {
	Temperature int
	Day         int
}

type DailyTemperatureStack struct {
	Data []DailyTemperature
}

func InitDailyTemperatureStack() DailyTemperatureStack {
	stack := DailyTemperatureStack{Data: nil}
	return stack
}

func (s *DailyTemperatureStack) Push(x DailyTemperature) {
	s.Data = append(s.Data, x)
}

func (s *DailyTemperatureStack) Pop() DailyTemperature {
	tem := s.Data[len(s.Data)-1]
	s.Data = s.Data[:len(s.Data)-1]
	return tem
}
func (s *DailyTemperatureStack) Top() DailyTemperature {
	return s.Data[len(s.Data)-1]
}

func dailyTemperatures(T []int) []int {
	stark := InitDailyTemperatureStack()
	dailyTem := make([]int, len(T))
	for day, temperature := range T {
		dt := DailyTemperature{
			Temperature: temperature,
			Day:         day,
		}
		if day == 0 {
			stark.Push(dt)
			continue
		}
		for len(stark.Data) > 0 {
			if stark.Top().Temperature < temperature {
				temp := stark.Pop()
				dailyTem[temp.Day] = day - temp.Day
			} else {
				break
			}
		}
		stark.Push(dt)
	}
	return dailyTem
}

//leetcode submit region end(Prohibit modification and deletion)
