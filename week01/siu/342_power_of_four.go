package siu

func isPowerOfFour(num int) bool {
	// 4的幂：正整数
	// 边界：0，1~3，4，5~7
	// 0: flase；与1对比
	// 1~3: x / 4 = 0：取余
	// 4: x / 4 = 1；与1对比
	// 5~7: x / 4 = 1；取余
	for num != 0 && num%4 == 0 {
		num = num / 4
	}
	return num == 1
}
