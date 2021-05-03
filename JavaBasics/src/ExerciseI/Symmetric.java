package ExerciseI;

class SymmetricMatrix {

  public static void main(String[] args) {

    int n = 7;

    int[][] sampleMatrix = new int[n][n];

    boolean isSymmetric = true;

    for (int i = 0; i < sampleMatrix.length; i++) {
      for (int j = 0; j < sampleMatrix[i].length; j++) {
        System.out.print(sampleMatrix);

      }

      if (sampleMatrix[1] == sampleMatrix[i]) {
        System.out.println(isSymmetric);
      }
      System.out.println();


    }
  }
}



