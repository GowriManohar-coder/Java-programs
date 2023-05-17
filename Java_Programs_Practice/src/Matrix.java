import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the rows requried");
		int rows = scan.nextInt();
		System.out.println("enter the columns requried");
		int columns = scan.nextInt();
		 
	        int[][] matrix1 = new int[rows][columns];
	        int[][] matrix2 = new int[rows][columns];
	        int[][] sum = new int[rows][columns];	        
	        
	        System.out.println("enter the elements of matrix 1");
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<columns;j++){
	                matrix1[i][j] = scan.nextInt();
	            }
	        }
	        System.out.println("enter the elements of matrix 2");
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<columns;j++){
	                matrix2[i][j] = scan.nextInt();
	            }
	        }
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<columns;j++){
	               sum[i][j]=matrix1[i][j]+matrix2[i][j];
	            }
	        }
	        System.out.println("Sum of the two matrices is: ");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	           }
	}
}