=begin
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
``` ruby
  Input: 2
  Output: 2
  Explanation: There are two ways to climb to the top.
  1. 1 step + 1 step
  2. 2 steps
```
Example 2:
``` ruby
  Input: 3
  Output: 3
  Explanation: There are three ways to climb to the top.
  1. 1 step + 1 step + 1 step
  2. 1 step + 2 steps
  3. 2 steps + 1 step
```

Constraints: 1 <= n <= 45
=end



# @param {Integer} n
# @return {Integer}

ClimbStairs = {1 => 1, 2 => 2}
def climb_stairs(n)

  return ClimbStairs[n] if ClimbStairs[n]

  (3..n).each do |num|
    ClimbStairs[num] = ClimbStairs[num-1] + ClimbStairs[num-2]
  end
  ClimbStairs[n]
end