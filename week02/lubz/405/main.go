package main

func toHex(num int) string {
	if num < 0 {
		num += 4294967296
	}
	if num == 0 {
		return "0"
	}

	var resultRune []rune
	hexRune := []rune{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'}

	for num != 0 {
		runeNum := []rune{hexRune[num%16]}
		num /= 16
		resultRune = append(runeNum, resultRune...)
	}

	return string(resultRune)
}
