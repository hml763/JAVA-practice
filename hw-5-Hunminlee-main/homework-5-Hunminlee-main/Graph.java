// Basic graph representation
// Do not modify this file
import java.util.*;

class Graph {

  Integer[][] matrix;

  public Graph(Integer[][] matrix) {
    this.matrix = matrix;
  }

  public List<Integer> getVertices() {
    ArrayList<Integer> results = new ArrayList<>();
    for (int i = 0; i < matrix.length; i++) {
      results.add(i);
    }
    return results;
  }

  public List<Integer> getNeighbors(int vertex) {
    ArrayList<Integer> results = new ArrayList<>();
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[vertex][i] == 1) {
        results.add(i);
      }
    }
    return results;
  }

}
