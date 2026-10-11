import java.util.Scanner;
class ReverseOfArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size elements: ");
		int n = sc.nextInt();
		int[] arr;
		arr =new int[n];

		for(int i = 0;i<n;i++){
			//arr[i] = sc.nextInt();
			arr[i] = 1 +(int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		} 
		System.out.println();
		for(int i = n-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		
	}
	
	}
	
}