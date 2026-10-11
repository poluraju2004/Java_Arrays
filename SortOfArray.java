import java.util.Scanner;
import java.util.Arrays;
class SortOfArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of elements: ");
		int n = sc.nextInt();
		int[] arr;
		arr = new int[n];

		for(int i = 0;i<n;i++){
			arr[i] = 1 + (int)(Math.random()*100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int sorts : arr){
			System.out.print(sorts+" ");
		}
	}
}