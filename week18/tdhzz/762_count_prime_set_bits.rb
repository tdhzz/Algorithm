require "prime"
def count_prime_set_bits(l, r)
  (l..r).count { |i| i.digits(2).sum.prime? }
end
