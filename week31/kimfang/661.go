package kimfang

func imageSmoother(M [][]int) [][]int {
	var ret [][]int

	for i := 0; i < len(M); i++ {
		var line []int

		for j := 0; j < len(M[i]); j++ {
			var total int
			var count int
			// 上面
			if i-1 >= 0 {
				total = total + M[i-1][j]
				count++
				// 左上
				if j-1 >= 0 {
					total = total + M[i-1][j-1]
					count++
				}
				// 右上
				if j+1 < len(M[i]) {
					total = total + M[i-1][j+1]
					count++
				}
			}

			// 下面
			if i+1 < len(M) {
				total = total + M[i+1][j]
				count++
				// 左下
				if j-1 >= 0 {
					total = total + M[i+1][j-1]
					count++
				}
				// 右下
				if j+1 < len(M[i]) {
					total = total + M[i+1][j+1]
					count++
				}
			}

			// 左边
			if j-1 >= 0 {
				total = total + M[i][j-1]
				count++
			}

			// 右边
			if j+1 < len(M[i]) {
				total = total + M[i][j+1]
				count++
			}

			line = append(line, (total+M[i][j])/(count+1))
		}

		ret = append(ret, line)
	}

	return ret
}
