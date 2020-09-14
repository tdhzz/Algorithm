package main

func checkIfExist(arr []int) bool {
	doubleArrMap := make(map[int]int)
	doubleZero := 0
	for k, v := range arr {
		doubleArrMap[v] = k + 1
		if v == 0 {
			doubleZero++
		}
	}

	if doubleZero >= 2 {
		return true
	}

	for _, v := range arr {
		if v != 0 && doubleArrMap[2*v] > 0 {
			return true
		}
	}
	return false
}
