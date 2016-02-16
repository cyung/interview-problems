class StockProfit {
  public static void main(String[] args) {
    int[] stockPrices = new int[]{8,3,5,11,5,2,8};

    System.out.println(getMaxProfit(stockPrices));
  }

  public static int getMaxProfit(int[] stockPrices) {
    if (stockPrices.length < 2) {
      throw new Error("Need at least two stock prices");
    }

    int maxProfit = stockPrices[1] - stockPrices[0];
    int minPrice = Math.min(stockPrices[0], stockPrices[1]);

    for (int i=2; i<stockPrices.length; i++) {
      maxProfit = Math.max(maxProfit, stockPrices[i]-minPrice);
      minPrice = Math.min(minPrice, stockPrices[i]);
    }

    return maxProfit;
  }
}