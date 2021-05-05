public class method {

  public static void main(String[] args) {


    int[][] proba = {

        {4, 1, 5, 6},
        {7, 3, 9, 7},
        {3, 8, 2, 1},
        {2, 5, 7, 4}
    };

   /*for (int i = 0; i < proba.length; i++) {
      for (int j = i; j < proba.length; j++) {
        int temp = proba[i][j];
        proba[i][j] = proba[j][i];
        proba[j][i] = temp;
        System.out.print(proba[i][j]);
      }
      System.out.println();
    }*/


    for (int i = 0; i < proba.length; i++) {
      for (int j = 0; j < (proba.length / 2); j++) {

        int temp = proba[i][j];
        proba[i][j] = proba[i][proba.length - 1 - j];
        proba[i][proba.length - 1 - j] = temp;


        System.out.print(proba[i][j]);
        System.out.println(proba[i][j] + " ");

      }
      System.out.println();

    }
  }
}





