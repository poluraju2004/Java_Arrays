import java.util.Scanner;
class SumOfOddIndexArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr;
		arr = new int[n];

		for(int i = 0;i<n;i++){
			arr[i] = 1 + (int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}

		int sum = 0;
		for(int i = 0;i<n;i++){
			if(i%2!=0){
				//System.out.println(i);
				sum += Math.pow(arr[i],2);

			}
		}
		System.out.print("sum = "+sum);
	}
}