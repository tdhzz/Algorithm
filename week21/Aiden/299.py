class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        a = 0
        m = {}
        num_len = len(secret)
        for i in range(num_len):
            if secret[i] == guess[i]:
                a += 1
            else:
                m[secret[i]] = m.get(secret[i], 0) + 1
                m[guess[i]] = m.get(guess[i], 0) - 1

        b = num_len - a - sum(filter(lambda x: x>0, m.values()))
        return '{a}A{b}B'.format(a=a, b=b)
