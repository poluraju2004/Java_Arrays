import java.util.Scanner;
public class ArraySumDiagnal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("entera size of elements: ");
		int n = sc.nextInt();
		int[][] arr;
		arr = new int[n][n];

		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				arr[i][j] = 1 + (int) (Math.random()*100);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		System.out.println();
		for(int i =  0;i<n;i++){
			sum += arr[i][i];
		}

		System.out.print("sum of diagnal value: "+sum);
	}
}