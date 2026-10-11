import java.util.Scanner;
class MultipltMatrices{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row  elements: ");
		int rows = sc.nextInt();

		System.out.print("Enter columns elements: ");	
		int cols = sc.nextInt();

		int[][] arr; 
		int[][] arr2;

		arr = new int[rows][cols];
		arr2= new int[rows][cols];

		int[][] result = new int[rows][cols];

		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cols;j++){
				arr[i][j] = 1 + (int) (Math.random()*100);

			System.out.print(arr[i][j]+ " ");

			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cols;j++){
				arr2[i][j] = 0 + (int)(Math.random()*100);
			System.out.print(arr2[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0;i<rows;i++){
			for(int j = 0 ;j<cols;j++){
				result[i][j] = arr[i][j] + arr2[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}