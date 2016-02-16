'use strict';

var stockPrices = [8,3,5,11,5,2,8];
console.log(getMaxProfit(stockPrices));

function getMaxProfit(stockPrices) {
  if (stockPrices.length < 2) {
    return 0;
  }

  var maxProfit = stockPrices[1] - stockPrices[0];
  var minPrice = Math.min(stockPrices[0], stockPrices[1]);

  if (stockPrices.length == 2) {
    return maxProfit;
  }

  for (var i=2; i<stockPrices.length; i++) {
    maxProfit = Math.max(maxProfit, stockPrices[i]-minPrice);
    minPrice = Math.min(minPrice, stockPrices[i]);
  }

  return maxProfit;
}