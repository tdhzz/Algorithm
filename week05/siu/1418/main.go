package main

import (
	"sort"
	"strconv"
)

func displayTable(orders [][]string) [][]string {
	if orders == nil || len(orders) == 0 {
		return [][]string{}
	}
	tmp := make([]string, 0)
	hash1 := make(map[string]bool, 0)
	for i := 0; i < len(orders); i++ {
		hash1[orders[i][2]] = true
	}
	for key, _ := range hash1 {
		tmp = append(tmp, key)
	}
	//将菜名按照字典序进行排序
	sort.Strings(tmp)
	tmp = append([]string{"Table"}, tmp...)
	//2、获取桌号和点菜数
	hash2 := make(map[string]map[string]int, 0)
	for i := 0; i < len(orders); i++ {
		if _, ok := hash2[orders[i][1]]; !ok {
			hash2[orders[i][1]] = make(map[string]int, 0)
		}
		hash2[orders[i][1]][orders[i][2]]++
	}
	//保存结果
	res := make([][]string, len(hash2))
	for i := 0; i < len(hash2); i++ {
		res[i] = make([]string, len(tmp))
	}
	//3、依次填入数据
	//先填入座位标号
	i := 0
	for key, _ := range hash2 {
		res[i][0] = key
		i++
	}
	//填入具体的订购菜品数量
	for i := 0; i < len(hash2); i++ {
		for j := 1; j < len(tmp); j++ {
			val := hash2[res[i][0]][tmp[j]]
			res[i][j] = strconv.Itoa(val)
		}
	}
	//4、进行排序
	sort.Slice(res, func(i, j int) bool {
		val1, _ := strconv.Atoi(res[i][0])
		val2, _ := strconv.Atoi(res[j][0])
		return val1 < val2
	})
	res = append([][]string{tmp}, res...)
	return res
}
