public class GridReach {

  public static void main(String[] args) {
    int[] X = new int[]{0,2,0,2,0};
    int[] Y = new int[]{0,0,2,3,6};

    System.out.println(gridReach(X, Y));
  }
  
  public static int gridReach(int[] X, int[] Y) {
    int currentX = X[0];
    int currentY = Y[0];
    int distance = 0;
    
    for (int i=1; i<X.length; i++) {
      distance += getDistance(currentX, currentY, X[i], Y[i]);
      currentX = X[i];
      currentY = Y[i];
    }
    
    return distance;
  }
  
  public static int getDistance(int x1, int y1, int x2, int y2) {
        int distX = Math.abs(x2-x1);
        int distY = Math.abs(y2-y1);
        
        int diagDist = Math.min(distX, distY);
        distX -= diagDist;
        distY -= diagDist;
        
        return distX + distY + diagDist;
  }

}
