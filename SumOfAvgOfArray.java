import java.util.Scanner;
class SumOfAvgOfArray{
	public static void main(String[] args) {
		int[] arr;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of elements: ");
		int n = sc.nextInt();
		arr = new int[n];
		int sum = 0;

		int fact = 1;

		for(int i = 0;i<n;i++){
			//arr[i] = sc.nextInt();
			arr[i] = 1 + (int) (Math.random()*100);
			System.out.print(arr[i]+" ");
			sum += arr[i];
			fact *= arr[i];
		}
		System.out.println();
			//sum += arr[i];
		System.out.println("sum =  "+sum);
		System.out.println("Fact = "+ fact);


	}
	
}