
public class program1_2Darray {
	public static void main(String[] args) {
		
		int[][] matrix = new int[3][];
		int i,j;
		
		for(i=0;i<matrix.length;i++)
			matrix[i] = new int[i+3];
		
		System.out.println(matrix[1].length);
		
		for(i=0;i<matrix.length;i++) {
			for(j=0;j<matrix[i].length;j++) {
				matrix[i][j] = i+j;
			}
		}
		
		for(i=0;i<matrix.length;i++) {
			for(j=0;j<matrix[i].length;j++) {
				System.out.print(" " + matrix[i][j]);				
			}
		    System.out.println();					
		}

		
	}
}
