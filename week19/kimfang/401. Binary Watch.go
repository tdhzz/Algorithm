package kimfang

import (
	"fmt"
	"strings"
)

func readBinaryWatch(num int) []string {
	result := []string{}
	for i := 0;i < 12;i++ {
		for j := 0;j < 60;j++ {
			b1 := fmt.Sprintf("%b",i)
			b2 := fmt.Sprintf("%b",j)
			sumOne := strings.Count(b1,"1") + strings.Count(b2,"1")
			if sumOne == num {
				result = append(result,fmt.Sprintf("%d:%02d",i,j))
			}

		}
	}
	return result
}