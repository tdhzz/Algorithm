# @param {String} secret
# @param {String} guess
# @return {String}
def get_hint(secret, guess)
    a = 0
    b = 0
    (0..secret.size - 1).each do |index|
        if secret[index] == guess[index]
            a += 1
            secret[index] = "A"
            guess[index] = "C"
        end
    end
    (0..secret.size - 1).each do |index|
        if secret.include?(guess[index])
            secret[secret.index(guess[index])] = "B"
            b += 1
        end
    end
    return "#{a}A#{b}B"
end
