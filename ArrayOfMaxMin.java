import java.util.Scanner;
class ArrayOfMaxMin{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of elements: ");
		int n = sc.nextInt();
		int[] arr;

		arr = new int[n];

		for(int i = 0;i<n;i++){
			arr[i] = 1 + (int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0;i<n;i++){
		if(arr[i]>max){
			max = arr[i];
			
		}}
		System.out.println();
		System.out.println("max = "+max);

		for(int i  = 0;i<n;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}

		System.out.println("min = "+min);

	}
}