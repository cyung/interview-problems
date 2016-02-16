import java.util.Arrays;

public class ProductOfOthers {

  public static void main(String[] args) {
    int[] numList = new int[]{2,3,4,5};

    System.out.println(Arrays.toString(productOfOthers(numList)));
  }

  public static int[] productOfOthers(int[] numList) {
    int[] productsBeforeIndex = new int[numList.length];
    int[] productsExceptAtIndex = new int[numList.length];

    int currentProductBefore = 1;

    for (int i=0; i<numList.length; i++) {
      productsBeforeIndex[i] = currentProductBefore;
      currentProductBefore *= numList[i];
    }

    int currentProductAfter = 1;

    for (int i=numList.length-1; i>=0; i--) {
      productsExceptAtIndex[i] = productsBeforeIndex[i] * currentProductAfter;
      currentProductAfter *= numList[i];
    }

    return productsExceptAtIndex;
  }

}
