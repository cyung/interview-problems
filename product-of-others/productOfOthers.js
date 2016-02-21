'use strict';

var numList = [2,3,4,5];
console.log(productOfOthers(numList));

function productOfOthers(numList) {
  var productsBeforeIndex = [];
  var productsExceptAtIndex = new Array(numList.length).fill(0);

  var currentProductBefore = 1;

  for (var i=0; i<numList.length; i++) {
    productsBeforeIndex.push(currentProductBefore);
    currentProductBefore *= numList[i];
  }

  var currentProductAfter = 1;
  for (var i=numList.length-1; i>=0; i--) {
    productsExceptAtIndex[i] = productsBeforeIndex[i] * currentProductAfter;
    currentProductAfter *= numList[i]
  }

  return productsExceptAtIndex;
}
