package main

func main() {
	println(isPowerOfTwo(16))
}

func isPowerOfTwo(n int) bool {
	if n > 0 {
		return n&(n-1) == 0
	}
	return false
}
