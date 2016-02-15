def get_max_profit(stock_prices):
  if len(stock_prices) < 2:
    raise IndexError('Need at least two stock prices')

  max_profit = stock_prices[1] - stock_prices[0]
  min_price = min(stock_prices[0], stock_prices[1])

  if len(stock_prices) == 2:
    return max_profit

  for price in stock_prices[2:]:
    max_profit = max(max_profit, price-min_price)
    min_price = min(min_price, price)

  return max_profit


if __name__ == '__main__':
  stock_prices = [8,3,5,11,5,2,8]
  print(get_max_profit(stock_prices))