package kimfang

import (
	"sort"
	"strconv"
)

//1418. 点菜展示表
//给你一个数组 orders，表示客户在餐厅中完成的订单，确切地说，
// orders[i]=[customerNamei,tableNumberi,foodItemi] ，
// 其中 customerNamei 是客户的姓名，tableNumberi 是客户所在餐桌的桌号，而 foodItemi 是客户点的餐品名称。
//
//请你返回该餐厅的 点菜展示表 。在这张表中，表中第一行为标题，其第一列为餐桌桌号 “Table” ，
// 后面每一列都是按字母顺序排列的餐品名称。接下来每一行中的项则表示每张餐桌订购的相应餐品数量，
// 第一列应当填对应的桌号，后面依次填写下单的餐品数量。
//
//注意：客户姓名不是点菜展示表的一部分。此外，表中的数据行应该按餐桌桌号升序排列。
//
//示例 1：
//输入：orders = [["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","Fried Chicken"],
// ["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]
//输出：[["Table","Beef Burrito","Ceviche","Fried Chicken","Water"],["3","0","2","1","0"],["5","0","1","0","1"],["10","1","0","0","0"]]
//解释：
//点菜展示表如下所示：
//Table,Beef Burrito,Ceviche,Fried Chicken,Water
//3    ,0           ,2      ,1            ,0
//5    ,0           ,1      ,0            ,1
//10   ,1           ,0      ,0            ,0
//对于餐桌 3：David 点了 "Ceviche" 和 "Fried Chicken"，而 Rous 点了 "Ceviche"
//而餐桌 5：Carla 点了 "Water" 和 "Ceviche"
//餐桌 10：Corina 点了 "Beef Burrito"
//示例 2：
//
//输入：orders = [["James","12","Fried Chicken"],["Ratesh","12","Fried Chicken"],["Amadeus","12","Fried Chicken"],["Adam","1","Canadian Waffles"],["Brianna","1","Canadian Waffles"]]
//输出：[["Table","Canadian Waffles","Fried Chicken"],["1","2","0"],["12","0","3"]]
//解释：
//对于餐桌 1：Adam 和 Brianna 都点了 "Canadian Waffles"
//而餐桌 12：James, Ratesh 和 Amadeus 都点了 "Fried Chicken"
//示例 3：
//
//输入：orders = [["Laura","2","Bean Burrito"],["Jhon","2","Beef Burrito"],["Melissa","2","Soda"]]
//输出：[["Table","Bean Burrito","Beef Burrito","Soda"],["2","1","1","1"]]
//
//
//提示：
//
//1 <= orders.length <= 5 * 10^4
//orders[i].length == 3
//1 <= customerNamei.length, foodItemi.length <= 20
//customerNamei 和 foodItemi 由大小写英文字母及空格字符 ' ' 组成。
//tableNumberi 是 1 到 500 范围内的整数。

func displayTable(orders [][]string) [][]string {
	titlesMap := make(map[string]struct{}, len(orders))
	tables := make(map[string]map[string]int64, len(orders))
	for _, order := range orders {
		// 记录点过那些菜
		titlesMap[order[2]] = struct{}{}
		// 该桌号第一次点菜
		foodsCountMap, exist := tables[order[1]]
		if !exist {
			tables[order[1]] = map[string]int64{order[2]: 1}
			continue
		}
		// 判断该桌号是否已点了这道菜
		if count, ok := foodsCountMap[order[2]]; ok {
			foodsCountMap[order[2]] = count + 1
			continue
		}
		foodsCountMap[order[2]] = 1
	}
	// 构建第一行
	firstRow := make([]string, 1, len(titlesMap)+1)
	firstRow[0] = "Table"
	tmpRow := make([]string, 0, len(titlesMap))
	for title := range titlesMap {
		tmpRow = append(tmpRow, title)
	}
	sort.Strings(tmpRow)
	firstRow = append(firstRow, tmpRow...)


	ans := make([][]string, 1, len(tables)+1)
	ans[0] = firstRow

	tableRows := make([][]string, 0, len(tables))
	var row []string
	for tableNo, foodsCountMap := range tables {
		row = make([]string, len(firstRow))
		row[0] = tableNo

		for i := 1; i < len(firstRow); i++ {
			if count, exist := foodsCountMap[firstRow[i]]; exist {
				row[i] = strconv.FormatInt(count, 10)
				continue
			}
			row[i] = "0"
		}
		tableRows = append(tableRows, row)
	}
	sort.Slice(tableRows, func(i, j int) bool {
		ii, _ := strconv.Atoi(tableRows[i][0])
		jj, _ := strconv.Atoi(tableRows[j][0])

		return ii < jj
	})
	return append(ans, tableRows...)
}
