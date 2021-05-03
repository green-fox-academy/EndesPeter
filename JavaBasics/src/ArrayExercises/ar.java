package ArrayExercises;

public class ar {
  public static void main(String[] args) {


    int[][] matrix = {{1, 1, 1, 1, 4},
        {2, 2, 2, 2},{5, 4 , 2 , 1 , 5},{3, 4, 6 , 7}};

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {

        System.out.print(matrix[i][j]+" ");
      }

      System.out.println();
    }
  }

}
