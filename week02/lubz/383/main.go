package main

func canConstruct(ransomNote string, magazine string) bool {
	if len(ransomNote) == 0 && len(magazine) == 0 {
		return true
	} else if len(magazine) == 0 {
		return false
	}

	ransomNoteMap := make(map[rune]int)
	ransomNoteLeftOverLen := len(ransomNote)
	for _, v := range ransomNote {
		ransomNoteMap[v] += 1
	}

	for _, v := range magazine {
		if ransomNoteMap[v] > 0 {
			ransomNoteMap[v]--
			ransomNoteLeftOverLen--
		}
		if ransomNoteLeftOverLen == 0 {
			return true
		}
	}

	return false
}
