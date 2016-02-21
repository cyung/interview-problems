import java.util.ArrayList;

public class MatrixSpiral {

  public static void main(String[] args) {
    int[][] matrix = makeMatrix(5);
    
    System.out.println(matrixSpiral(matrix).toString());
  }
  
  public static int[][] makeMatrix(int N) {
    int[][] matrix = new int[N][N];
    int count = 1;
    
    for (int i=0; i<N; i++) {
      for (int j=0; j<N; j++) {
        matrix[i][j] = count;
        count++;
      }
    }
    
    return matrix;
  }
  
  public static ArrayList<Integer> matrixSpiral(int[][] matrix) {
    int m = matrix.length; // number of rows
    int n = matrix[0].length; // number of columns
    int x = 0;
    int y = 0;
    ArrayList<Integer> spiral = new ArrayList<Integer>();
    
    while (m>0 && n>0) {

      // if there is only one row remaining, add and return
      if (m==1) {
        for (int i=0; i<n; i++) {
          spiral.add(matrix[x][y+i]);
        }
        return spiral;
      }
      
      // if there is only one column remaining, add and return
      if (n==1) {
        for (int i=0; i<m; i++) {
          spiral.add(matrix[x+i][y]);
        }
        return spiral;
      }
      
      // top
      for (int i=0; i<n-1; i++) {
        spiral.add(matrix[x][y++]);
      }
      
      // right
      for (int i=0; i<m-1; i++) {
        spiral.add(matrix[x++][y]);
      }

      // bottom
      for (int i=0; i<n-1; i++) {
        spiral.add(matrix[x][y--]);
      }
      // left
      for (int i=0; i<m-1; i++) {
        spiral.add(matrix[x--][y]);
      }

      // after adding the outer perimeter, proceed to the inner matrix
      x++;
      y++;
      m -= 2;
      n -= 2;
    }
    
    return spiral;
  }

}
