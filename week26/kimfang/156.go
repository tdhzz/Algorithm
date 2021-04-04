package kimfang

func pyramidTransition(bottom string, allowed []string) bool {
	layer := make([]int, len(bottom))
	for i, r := range bottom {
		layer[i] = 1 << (r - 'A')
	}

	mapping := make([][]int, 8)
	for i := 0; i < 8; i++ {
		mapping[i] = make([]int, 8)
	}
	for _, s := range allowed {
		x := s[0] - 'A'
		y := s[1] - 'A'
		mapping[x][y] |= 1 << (s[2] - 'A')
	}

	for len(layer) > 1 {
		upperLayer := make([]int, len(layer)-1)
		for i := 0; i < len(upperLayer); i++ {
			for j := 0; j < 8; j++ {
				if (layer[i] & (1 << j)) > 0 {
					for k := 0; k < 8; k++ {
						if (layer[i+1] & (1 << k)) > 0 {
							upperLayer[i] |= mapping[j][k]
						}
					}
				}
			}
			if upperLayer[i] == 0 {
				return false
			}
		}
		layer = upperLayer
	}
	return true
}
