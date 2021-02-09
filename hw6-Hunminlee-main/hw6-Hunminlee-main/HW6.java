import java.util.*;

class HW6 {

  public static String pantherID() {
    return null;
  }

  public static void main(String[] args) {
    Integer[][] m = MatrixGenerator.generate(pantherID());
    System.out.println("Your adjacency matrix:");
    printMatrix(m);
    System.out.println(
      String.format("Run Dijktra's starting at node %d", findFirstNonNullRow(m))
    );
  }

  public static void printMatrix(Integer[][] m) {
    for (Integer[] arr : m) {
      String[] row = new String[arr.length];
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] != null) {
	  if (arr[i] > 9) {
  	    row[i] = "  " + arr[i];  // Gotta pad the double digits
	  } else {
  	    row[i] = "   " + arr[i]; // Gotta pad the single digits
	  }
	}
      }
      System.out.println(Arrays.toString(row));
    }
  }

  public static int findFirstNonNullRow(Integer[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (Integer edge : m[i]) {
        if (edge != null) {
	  return i;
	}
      }
    }
    return -1;
  }

}
