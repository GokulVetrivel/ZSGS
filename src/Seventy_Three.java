
public class Seventy_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{1,1,3},
					{1,0,0},
					{1,5,9}};
		setZeroes(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
	 public static void setZeroes(int[][] matrix) {
	     int r=matrix.length;
	     int c=matrix[0].length;
	     boolean b[][]=new boolean[r][c];
	     for(int i=0;i<r;i++) {
	    	 for(int j=0;j<c;j++) {
	    		 if(matrix[i][j]==0)
	    			 b[i][j]=true;
	    	 }
	     }
	     for(int i=0;i<r;i++) {
	    	 for(int j=0;j<c;j++) {
	    		 if(b[i][j]) {
	    			 zeroRow(i,matrix);
	    			 zeroColumn(j,matrix);
	    		 }
	    			 
	    	 }
	     }
	 }
	private static void zeroColumn(int j, int[][] m) {
		// TODO Auto-generated method stub
		for(int i=0;i<m.length;i++)
			m[i][j]=0;
		
	}
	private static void zeroRow(int i, int[][] m) {
		// TODO Auto-generated method stub
		for(int j=0;j<m[0].length;j++)
			m[i][j]=0;
		
	}
}
