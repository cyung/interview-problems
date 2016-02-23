You are given an amount of money, and a list of denominations. Find the number of possibles ways to make that amount with the available denominations.

Example:
  input: 4, [1,2,3]
  output: 4
    // possible ways being
    [1,1,1,1]
    [1,1,2]
    [1,3]
    [2,2]

Requirements:
O(n*m) time where n is the amount and m is the number of denominations
O(n) space