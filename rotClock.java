public class rotClock{
	public void rotate(int[][] matrix){
		int current;
		int current1;
		int i=0;
		int j=0;
		int n = matrix[0].length - 1;

		while(i<n/2 && matrix.length == matrix[0].length){
			for(j=i;j<n-i;j++){
				if( !( i==n/2 && n%2 == 0)){
					current = matrix[j][n-i];
					matrix[j][n-i] = matrix[i][j];
					current1 = matrix[n-i][n-j];
					matrix[n-i][n-j] = current;
					current = matrix[n-j][i];
					matrix[n-j][i] = current1;
					matrix[i][j] = current;
				}
			}
			i++;
		}
	}

	public static void main(String args[]){
	}
}


