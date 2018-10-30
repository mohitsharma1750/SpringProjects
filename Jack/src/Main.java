import java.util.Arrays;
import java.util.List;

public class Main {   
	
	public static boolean hasPathHelper(Integer[][] m, int[][] v, int i, int j){
    if(i < 0 || j < 0 || i >= m.length || j >= m[0].length || v[i][j] >= 0)
        return false;                        // Index out of bounds

    v[i][j] = 0;                             // Mark as visited
    if(m[i][j] == 0)                         // Path stops here
        return false;
    if(j == m[0].length - 1 ||               // Right side reached!
       hasPathHelper(m, v, i - 1, j + 1) ||  // Check upper right
       hasPathHelper(m, v, i + 1, j + 1) ||  // Check lower right
       hasPathHelper(m, v, i + 1, j - 1) ||  // Check lower left
       hasPathHelper(m, v, i + 1, j - 1) ||  // Check upper left
       hasPathHelper(m, v, i + 1, j    ) ||  // Check down
       hasPathHelper(m, v, i - 1, j    ) ||  // Check up
       hasPathHelper(m, v, i    , j + 1) ||  // Check right
       hasPathHelper(m, v, i    , j - 1)     // Check left
    ) v[i][j] = 1;                           // Mark as good path

    return v[i][j] == 1;
}

public static int hasPath(Integer[][] m, int[][] v){

    int totalPaths = 0;
    for(int i = 0; i < m.length; i++) {
        if(hasPathHelper(m, v, i, 0))
             totalPaths++;
    }
    return totalPaths;

}
   

// Complete the countSpecialElements function below.
    static int countSpecialElements(List<List<Integer>> matrix) {


 Integer[][] array = new Integer[matrix.size()][];
          for (int i = 0; i < matrix.size(); i++) {
              List<Integer> row = matrix.get(i);
              array[i] = row.toArray(new Integer[row.size()]);
}

    int[][] v = new int[matrix.size()][matrix.get(0).size()];                         // v => -1, not visited
    for(int i=0; i<5; i++)                             // v =>  0, visited bad path
        Arrays.fill(v[i], -1);           
      hasPath(array, v);
                   
                   return 7 ;
}
    
}